(ns ch.lyrion.carbon.data-table.ui-table-batch-action
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableBatchAction.js" :default TableBatchAction]))

(def ui-table-batch-action

"Props:
  - renderIcon (union): Optional function to render your own icon in the underlying button Default: iconAddSolid 
  - hasIconOnly (bool): Specify if the button is an icon-only button  
  - iconDescription (custom): If specifying the `renderIcon` prop, provide a description for that icon that can
be read by screen readers  
"
  (h/factory-apply TableBatchAction))