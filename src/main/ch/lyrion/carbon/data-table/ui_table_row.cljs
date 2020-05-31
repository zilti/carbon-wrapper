(ns ch.lyrion.carbon.data-table.ui-table-row
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableRow.js" :default TableRow]))

(def ui-table-row

"Props:
  - className (string): Specify an optional className to be applied to the container node  
"
  (h/factory-apply TableRow))