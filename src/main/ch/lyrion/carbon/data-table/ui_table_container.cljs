(ns ch.lyrion.carbon.data-table.ui-table-container
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableContainer.js" :default TableContainer]))

(def ui-table-container

"Props:
  - className (string):   
  - children (node):   
  - title (node): Provide a title for the Table  
  - description (node): Optional description text for the Table  
"
  (h/factory-apply TableContainer))