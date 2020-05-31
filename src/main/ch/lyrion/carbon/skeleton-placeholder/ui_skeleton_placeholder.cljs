(ns ch.lyrion.carbon.skeleton-placeholder.ui-skeleton-placeholder
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/SkeletonPlaceholder/SkeletonPlaceholder.js" :default SkeletonPlaceholder]))

(def ui-skeleton-placeholder

"Props:
  - className (string): the class to be applied to the component  
"
  (h/factory-apply SkeletonPlaceholder))