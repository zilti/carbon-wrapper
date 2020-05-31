(ns ch.lyrion.carbon.tag.ui-tag-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Tag/Tag.Skeleton.js" :default TagSkeleton]))

(def ui-tag-skeleton

"Props:
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply TagSkeleton))