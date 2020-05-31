(ns ch.lyrion.carbon.search.ui-search-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Search/Search.Skeleton.js" :default SearchSkeleton]))

(def ui-search-skeleton

"Props:
  - small (bool): Specify whether the Search should be a small variant Default: false 
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply SearchSkeleton))