(ns ch.lyrion.carbon.form-label.ui-form-label
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FormLabel/FormLabel.js" :default FormLabel]))

(def ui-form-label

"Props:
  - children (node): Specify the content of the form label  
  - className (string): Provide a custom className to be applied to the containing <label> node  
  - id (string): Provide a unique id for the given <FormLabel>  
"
  (h/factory-apply FormLabel))