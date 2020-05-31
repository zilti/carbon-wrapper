(ns ch.lyrion.carbon.search-layout-button.ui-search-layout-button
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/SearchLayoutButton/SearchLayoutButton.js" :default SearchLayoutButton]))

(def ui-search-layout-button

"The layout button for `<Search>`.
Props:
  - labelText (string): The a11y label text. Default: 'Filter' 
  - iconDescriptionList (string): The description for the \"list\" icon. Default: 'list' 
  - iconDescriptionGrid (string): The description for the \"grid\" icon. Default: 'grid' 
  - format (enum): The layout.  
  - onChangeFormat (func): The callback called when layout switches.  
"
  (h/factory-apply SearchLayoutButton))