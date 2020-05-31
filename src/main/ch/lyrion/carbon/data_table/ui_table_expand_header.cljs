(ns ch.lyrion.carbon.data-table.ui-table-expand-header
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableExpandHeader.js" :default TableExpandHeader]))

(def ui-table-expand-header

"Props:
  - className (string):   
  - children (node):   
  - ariaLabel (custom): Specify the string read by a voice reader when the expand trigger is
focused  
  - isExpanded (custom): Specify whether this row is expanded or not. This helps coordinate data
attributes so that `TableExpandRow` and `TableExapndedRow` work together  
  - onExpand (custom): Hook for when a listener initiates a request to expand the given row  
  - expandIconDescription (string): The description of the chevron right icon, to be put in its SVG `<title>` element.  
"
  (h/factory-apply TableExpandHeader))