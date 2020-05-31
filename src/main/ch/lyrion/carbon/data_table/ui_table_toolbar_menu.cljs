(ns ch.lyrion.carbon.data-table.ui-table-toolbar-menu
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableToolbarMenu.js" :default TableToolbarMenu]))

(def ui-table-toolbar-menu

"Props:
  - renderIcon (union): Optional prop to allow overriding the default menu icon Default: Settings16 
  - iconDescription (string): The description of the menu icon. Default: 'Settings' 
  - children (node) (required):   
  - className (string): Provide an optional class name for the toolbar menu  
"
  (h/factory-apply TableToolbarMenu))