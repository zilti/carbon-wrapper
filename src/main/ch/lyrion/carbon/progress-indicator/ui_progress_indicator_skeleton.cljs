(ns ch.lyrion.carbon.progress-indicator.ui-progress-indicator-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ProgressIndicator/ProgressIndicator.Skeleton.js" :default ProgressIndicatorSkeleton]))

(def ui-progress-indicator-skeleton

"Props:
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply ProgressIndicatorSkeleton))