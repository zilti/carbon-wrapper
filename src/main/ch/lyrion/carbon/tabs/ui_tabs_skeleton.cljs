(ns ch.lyrion.carbon.tabs.ui-tabs-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Tabs/Tabs.Skeleton.js" :default TabsSkeleton]))

(def ui-tabs-skeleton

"Props:
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply TabsSkeleton))