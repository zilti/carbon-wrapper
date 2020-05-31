(ns ch.lyrion.carbon.data-table.ui-table-select-all
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableSelectAll.js" :default TableSelectAll]))

(def ui-table-select-all

"Props:
  - ariaLabel (string): Specify the aria label for the underlying input control Default: 'Select all rows in the table' 
  - checked (bool) (required): Specify whether all items are selected, or not  
  - id (string) (required): Provide an `id` for the underlying input control  
  - indeterminate (bool): Specify whether the selection only has a subset of all items  
  - name (string) (required): Provide a `name` for the underlying input control  
  - onSelect (func) (required): Provide a handler to listen to when a user initiates a selection request  
  - className (string): The CSS class names of the cell that wraps the underlying input control  
"
  (h/factory-apply TableSelectAll))