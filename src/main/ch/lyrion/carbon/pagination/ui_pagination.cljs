(ns ch.lyrion.carbon.pagination.ui-pagination
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Pagination/Pagination.js" :default Pagination]))

(def ui-pagination

"Props:
  - backwardText (string): The description for the backward icon. Default: 'Previous page' 
  - itemText (func): A variant of `itemRangeText`, used if the total number of items is unknown. Default: (min, max) => `${min}–${max} items` 
  - itemRangeText (func): The function returning a translatable text showing where the current page is,
in a manner of the range of items. Default: (min, max, total) => `${min}–${max} of ${total} items` 
  - disabled (bool): `true` if the backward/forward buttons should be disabled. Default: false 
  - pageText (func): The translatable text showing the current page. Default: page => `page ${page}` 
  - isLastPage (bool): `true` if the current page should be the last page. Default: false 
  - page (number): The current page. Default: 1 
  - pageInputDisabled (bool): `true` if the select box to change the page should be disabled. Default: false 
  - totalItems (number): The total number of items.  
  - forwardText (string): The description for the forward icon. Default: 'Next page' 
  - className (string): The CSS class names.  
  - pageSizes (arrayOf) (required): The choices for `pageSize`.  
  - pageSize (number): The number dictating how many items a page contains.  
  - id (union): The unique ID of this component instance.  
  - pageRangeText (func): A function returning PII showing where the current page is. Default: (current, total) => `of ${total} pages` 
  - pagesUnknown (bool): `true` if the total number of items is unknown. Default: false 
  - itemsPerPageText (string): The translatable text indicating the number of items per page. Default: 'Items per page:' 
  - onChange (func): The callback function called when the current page changes.  
  - pageNumberText (string):  Default: 'Page Number' 
"
  (h/factory-apply Pagination))