(ns ch.lyrion.carbon.data-table.ui-table-toolbar-search
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableToolbarSearch.js" :default TableToolbarSearch]))

(def ui-table-toolbar-search

"Props:
  - children (node):   
  - searchContainerClasses (string): Provide an optional className for the overal container of the Search  
  - tabIndex (union): Optional prop to specify the tabIndex of the <Search> (in expanded state) or the container (in collapsed state) Default: '0' 
  - translateWithId (func): Provide custom text for the component for each translation id Default: id => {
  return translationKeys[id];
} 
  - persistent (bool): Whether the search should be allowed to expand Default: false 
  - persistant (custom):   
  - className (string): Provide an optional class name for the search container  
  - id (string): Provide an optional id for the search container  
  - defaultValue (string): Provide an optional default value for the Search component  
  - placeHolderText (string): Provide an optional placeholder text for the Search component  
  - onChange (func): Provide an optional hook that is called each time the input is updated  
  - labelText (string): Provide an optional label text for the Search component icon  
"
  (h/factory-apply TableToolbarSearch))