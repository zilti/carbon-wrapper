(ns ch.lyrion.carbon.data-table.ui-table-expand-row
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableExpandRow.js" :default TableExpandRow]))

(def ui-table-expand-row

"Props:
  - expandHeader (string): The id of the matching th node in the table head. Addresses a11y concerns outlined here: https://www.ibm.com/able/guidelines/ci162/info_and_relationships.html and https://www.w3.org/TR/WCAG20-TECHS/H43 Default: 'expand' 
  - ariaLabel (string) (required): Specify the string read by a voice reader when the expand trigger is
focused  
  - className (string):   
  - children (node):   
  - isExpanded (bool) (required): Specify whether this row is expanded or not. This helps coordinate data
attributes so that `TableExpandRow` and `TableExapndedRow` work together  
  - onExpand (func) (required): Hook for when a listener initiates a request to expand the given row  
  - expandIconDescription (string): The description of the chevron right icon, to be put in its SVG `<title>` element.  
"
  (h/factory-apply TableExpandRow))