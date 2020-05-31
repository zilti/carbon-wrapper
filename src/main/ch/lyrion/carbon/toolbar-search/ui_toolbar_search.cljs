(ns ch.lyrion.carbon.toolbar-search.ui-toolbar-search
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ToolbarSearch/ToolbarSearch.js" :default ToolbarSearch]))

(def ui-toolbar-search

"Props:
  - role (null): null Default: 'search' 
  - children (node): The child nodes.  
  - type (string): The `type` of the `<input>`. Default: 'search' 
  - className (string): The CSS class names.  
  - small (bool): `true` to use the small version of the UI.  
  - labelId (null): null Default: 'search__label' 
  - id (string): The ID of the `<input>`. Default: 'search__input' 
  - placeHolderText (string): The placeholder text of the `<input>`. Default: '' 
  - labelText (node): The text in the `<label>`. Default: '' 
"
  (h/factory-apply ToolbarSearch))