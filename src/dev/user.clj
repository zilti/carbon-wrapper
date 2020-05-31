(ns user
  (:require
   [clojure.string :as str]
   [clojure.data.json :as json]
   [clojure.java.io :as io]))

(defn gen-prop-docstring [prop {:keys [defaultValue type required description]}]
  (let [prop (name prop)
        required (if required " (required)" "")
        type (format "(%s)" (:name type))
        description description
        defaultValue (if defaultValue (format "Default: %s" (:value defaultValue)) "")
        values (if (:value type) (format "Possible values: %s" (:value type)) "")]
    (format "  - %s %s%s: %s %s %s\n" prop type required description defaultValue values)))

(defn gen-docstring [{:keys [description props]}]
  (let [description (if-not (str/blank? description) (str description "\n") description)
        props (reduce #(str %1 (gen-prop-docstring (key %2) (val %2)))
                      "Props:\n"
                      props)]
    (str description props)))

(defn quoted [s] (str "\"" s "\""))
(defn escaped [s] (str/replace s "\"" "\\\""))

(defn hyphenated [camelCase]
  (println "Hyphenating" camelCase)
  (if (= "UIShell" camelCase)
    "ui-shell"
    (-> camelCase
        (str/replace #"([A-Z])" "-$1")
        (str/lower-case)
        (str/replace #"^-" ""))))

(def input-factory-classes
  #{"Checkbox"
    "ComboBox"
    "FormInput"
    "DropdownSearchInput"
    "Search"
    "TextArea"
    "TextInput"})

(defn factory-helper [class]
  (if (contains? input-factory-classes class)
    "wrapped-factory-apply"
    "factory-apply"))

(defn gen-json [js]
  (let [datasplit (str/split js #";\n")
        match (first (filter #(re-find #".*__docgen.*" %) datasplit))]
    (if-not (nil? match)
      (json/read-str (apply str (drop-while #(not= % \{) match)) :key-fn keyword)
      nil)))

(defn guess-display-name [file display-name]
  (if (nil? display-name)
    (do (print "No display name found for" file "and thus will guess...")
        (let [display-name (-> file
                               (str/replace #"\.js" "")
                               (str/replace #"\." ""))]
          (println "Guessed name:" display-name)
          display-name))
    display-name))

(defn gen-factory-map [dir]
  (fn [{:keys [subdir file]}]
    (println "Generating" subdir "/" file "...")
    (if-let [{:keys [displayName description props] :as docs} (gen-json (slurp (str dir "/" subdir "/" file)))]
      (let [displayName  (guess-display-name file displayName)
            class        displayName
            factory-name (str "ui-" (hyphenated class))
            filename     (str "src/main/ch/lyrion/carbon/" (hyphenated subdir) "/" (str/replace factory-name #"-" "_") ".cljs")
            nns          (str "ch.lyrion.carbon." (hyphenated subdir) "." factory-name)
            include-file (str "carbon-components-react/lib/components/" subdir "/" file)
            docstring    (gen-docstring docs)]
        {:class class
         :factory-name factory-name
         :filename filename
         :ns nns
         :include-file include-file
         :docstring docstring})
      nil)))

(defn gen-component-filelist [dir]
  (fn [subdir]
    (let [path (str dir "/" subdir)]
      (->> (seq (.list (io/file path)))
           (remove #(or (= % "index.js")
                        (str/ends-with? % "-story.js")
                        (str/ends-with? % "-test.js")
                        (not (str/ends-with? % ".js"))))
           (map #(identity {:subdir subdir
                            :file %}))))))

(defn factory-ns-shadow [ns class factory-name include-file docstring]
  (str "(ns " ns "\n"
       "  (:require\n"
       "    [ch.lyrion.carbon.factory-helpers :as h]\n"
       "    [\"" include-file "\" :default " class "]))\n\n"
       "(def " factory-name "\n"
       "\n"
       (quoted (escaped docstring))
       "\n  (h/" (factory-helper class) " " class "))"))

(defn gen-factories [component-dir]
  (let [modules (->> (seq (.list (io/file component-dir)))
                     (map (gen-component-filelist component-dir))
                     flatten
                     (map (gen-factory-map component-dir))
                     (remove nil?)
                     (sort-by :factory-name))]
    (io/make-parents "src/main/ch/lyrion/carbon/factories.cljs")
    (doseq [{:keys [filename ns class factory-name include-file filename docstring] :as m} modules]
      (println "Generating" filename "...")
      (io/make-parents filename)
      (spit (io/as-file filename) (factory-ns-shadow ns class factory-name include-file docstring)))))
