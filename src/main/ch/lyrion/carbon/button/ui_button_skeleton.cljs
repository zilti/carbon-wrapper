(ns ch.lyrion.carbon.button.ui-button-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Button/Button.Skeleton.js" :default ButtonSkeleton]))

(def ui-button-skeleton

"Props:
  - small (bool): Specify whether the Button should be a small variant Default: false 
  - href (string): Optionally specify an href for your Button to become an <a> element  
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply ButtonSkeleton))