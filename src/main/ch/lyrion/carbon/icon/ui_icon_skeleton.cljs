(ns ch.lyrion.carbon.icon.ui-icon-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Icon/Icon.Skeleton.js" :default IconSkeleton]))

(def ui-icon-skeleton

"Props:
  - style (object): The CSS styles.  
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply IconSkeleton))