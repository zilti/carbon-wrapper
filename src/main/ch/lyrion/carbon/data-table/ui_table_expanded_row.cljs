(ns ch.lyrion.carbon.data-table.ui-table-expanded-row
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableExpandedRow.js" :default TableExpandedRow]))

(def ui-table-expanded-row

"Props:
  - children (node): Pass in the contents for your TableExpandedRow  
  - className (string): Specify an optional className to be applied to the container node  
  - colSpan (number) (required): The width of the expanded row's internal cell  
"
  (h/factory-apply TableExpandedRow))