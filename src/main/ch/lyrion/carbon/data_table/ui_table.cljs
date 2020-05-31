(ns ch.lyrion.carbon.data-table.ui-table
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/Table.js" :default Table]))

(def ui-table

"Props:
  - isSortable (bool): `false` If true, will apply sorting styles Default: false 
  - overflowMenuOnHover (bool): Specify whether the overflow menu (if it exists) should be shown always, or only on hover Default: true 
  - className (string):   
  - useZebraStyles (bool): `true` to add useZebraStyles striping.  
  - size (enum): `normal` Change the row height of table  
  - useStaticWidth (bool): `false` If true, will use a width of 'auto' instead of 100%  
  - shouldShowBorder (bool): `false` If true, will remove the table border  
  - stickyHeader (bool): `false` If true, will keep the header sticky (only data rows will scroll)  
"
  (h/factory-apply Table))