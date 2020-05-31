(ns ch.lyrion.carbon.search-filter-button.ui-search-filter-button
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/SearchFilterButton/SearchFilterButton.js" :default SearchFilterButton]))

(def ui-search-filter-button

"The filter button for `<Search>`.
Props:
  - labelText (string): The a11y label text. Default: 'Search' 
  - iconDescription (string): The icon description. Default: 'filter' 
"
  (h/factory-apply SearchFilterButton))