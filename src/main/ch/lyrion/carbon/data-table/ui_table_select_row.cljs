(ns ch.lyrion.carbon.data-table.ui-table-select-row
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableSelectRow.js" :default TableSelectRow]))

(def ui-table-select-row

"Props:
  - ariaLabel (string) (required): Specify the aria label for the underlying input control  
  - checked (bool) (required): Specify whether all items are selected, or not  
  - disabled (bool): Specify whether the control is disabled  
  - id (string) (required): Provide an `id` for the underlying input control  
  - name (string) (required): Provide a `name` for the underlying input control  
  - onSelect (func) (required): Provide a handler to listen to when a user initiates a selection request  
  - radio (bool): Specify whether the control should be a radio button or inline checkbox  
  - className (string): The CSS class names of the cell that wraps the underlying input control  
"
  (h/factory-apply TableSelectRow))