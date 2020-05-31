(ns ch.lyrion.carbon.number-input.ui-number-input-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/NumberInput/NumberInput.Skeleton.js" :default NumberInputSkeleton]))

(def ui-number-input-skeleton

"Props:
  - hideLabel (bool): Specify whether the label should be hidden, or not  
  - className (string): Specify an optional className to add to the form item wrapper.  
"
  (h/factory-apply NumberInputSkeleton))