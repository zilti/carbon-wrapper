(ns ch.lyrion.carbon.checkbox.ui-checkbox-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Checkbox/Checkbox.Skeleton.js" :default CheckboxSkeleton]))

(def ui-checkbox-skeleton

"Props:
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply CheckboxSkeleton))