(ns ch.lyrion.carbon.radio-button.ui-radio-button-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/RadioButton/RadioButton.Skeleton.js" :default RadioButtonSkeleton]))

(def ui-radio-button-skeleton

"Props:
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply RadioButtonSkeleton))