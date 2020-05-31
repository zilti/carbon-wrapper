(ns ch.lyrion.carbon.select.ui-select-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Select/Select.Skeleton.js" :default SelectSkeleton]))

(def ui-select-skeleton

"Props:
  - hideLabel (bool): Specify whether the label should be hidden, or not  
  - className (string): Specify an optional className to add to the form item wrapper.  
"
  (h/factory-apply SelectSkeleton))