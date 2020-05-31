(ns ch.lyrion.carbon.slider.ui-slider-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Slider/Slider.Skeleton.js" :default SliderSkeleton]))

(def ui-slider-skeleton

"Props:
  - hideLabel (bool): Specify whether the label should be hidden, or not  
  - className (string): Specify an optional className to add to the form item wrapper.  
"
  (h/factory-apply SliderSkeleton))