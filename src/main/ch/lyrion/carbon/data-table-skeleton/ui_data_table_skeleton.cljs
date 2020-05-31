(ns ch.lyrion.carbon.data-table-skeleton.ui-data-table-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTableSkeleton/DataTableSkeleton.js" :default DataTableSkeleton]))

(def ui-data-table-skeleton

"Props:
  - rowCount (number): Specify the number of rows that you want to render in the skeleton state Default: 5 
  - columnCount (number): Specify the number of columns that you want to render in the skeleton state Default: 5 
  - zebra (bool): Optionally specify whether you want the DataTable to be zebra striped Default: false 
  - compact (bool): Optionally specify whether you want the Skeleton to be rendered as a
compact DataTable Default: false 
  - headers (union): Optionally specify the displayed headers Default: [] 
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply DataTableSkeleton))