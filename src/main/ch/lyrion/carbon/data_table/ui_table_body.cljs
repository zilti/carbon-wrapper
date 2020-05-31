(ns ch.lyrion.carbon.data-table.ui-table-body
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableBody.js" :default TableBody]))

(def ui-table-body

"Props:
  - aria-live (enum): `polite` Adjust the notification behavior of screen readers Default: 'polite' 
  - className (string):   
  - children (node):   
"
  (h/factory-apply TableBody))