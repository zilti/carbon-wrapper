(ns ch.lyrion.carbon.structured-list.ui-structured-list-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/StructuredList/StructuredList.Skeleton.js" :default StructuredListSkeleton]))

(def ui-structured-list-skeleton

"Props:
  - rowCount (number): number of table rows Default: 5 
  - border (bool): Specify whether a border should be added to your StructuredListSkeleton Default: false 
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply StructuredListSkeleton))