(ns ch.lyrion.carbon.data-table.ui-table-toolbar-action
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableToolbarAction.js" :default TableToolbarAction]))

(def ui-table-toolbar-action

"Props:
  - children (node):   
  - className (string):   
  - onClick (func) (required):   
"
  (h/factory-apply TableToolbarAction))