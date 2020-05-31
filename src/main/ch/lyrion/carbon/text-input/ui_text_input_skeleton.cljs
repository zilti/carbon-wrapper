(ns ch.lyrion.carbon.text-input.ui-text-input-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TextInput/TextInput.Skeleton.js" :default TextInputSkeleton]))

(def ui-text-input-skeleton

"Props:
  - hideLabel (bool): Specify whether the label should be hidden, or not  
  - className (string): Specify an optional className to add to the form item wrapper.  
"
  (h/factory-apply TextInputSkeleton))