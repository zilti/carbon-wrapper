(ns ch.lyrion.carbon.pagination.ui-pagination-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Pagination/Pagination.Skeleton.js" :default PaginationSkeleton]))

(def ui-pagination-skeleton

"Props:
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply PaginationSkeleton))