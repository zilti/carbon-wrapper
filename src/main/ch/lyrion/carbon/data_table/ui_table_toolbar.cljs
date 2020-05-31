(ns ch.lyrion.carbon.data-table.ui-table-toolbar
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableToolbar.js" :default TableToolbar]))

(def ui-table-toolbar

"Props:
  - aria-label (null): null Default: 'data table toolbar' 
  - children (node): Pass in the children that will be rendered inside the TableToolbar  
  - size (enum): `normal` Change the row height of table  
"
  (h/factory-apply TableToolbar))