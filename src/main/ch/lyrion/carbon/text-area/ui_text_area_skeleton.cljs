(ns ch.lyrion.carbon.text-area.ui-text-area-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TextArea/TextArea.Skeleton.js" :default TextAreaSkeleton]))

(def ui-text-area-skeleton

"Props:
  - hideLabel (bool): Specify whether the label should be hidden, or not  
  - className (string): Specify an optional className to add to the form item wrapper.  
"
  (h/factory-apply TextAreaSkeleton))