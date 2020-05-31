(ns ch.lyrion.carbon.search.ui-search
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Search/Search.js" :default Search]))

(def ui-search

"Props:
  - value (union): Specify the value of the <input>  
  - closeButtonLabelText (string): Specify a label to be read by screen readers on the \"close\" button Default: 'Clear search input' 
  - type (string): Optional prop to specify the type of the `<input>` Default: 'text' 
  - className (string): Specify an optional className to be applied to the container node  
  - size (enum): Specify the search size  
  - small (custom): Specify whether the load was successful  
  - id (string): Specify a custom `id` for the input  
  - defaultValue (union): Optionally provide the default value of the <input>  
  - placeHolderText (string): Provide an optional placeholder text for the Search.
Note: if the label and placeholder differ,
VoiceOver on Mac will read both Default: '' 
  - onChange (null): null Default: () => {} 
  - light (bool): Specify light version or default version of this control  
  - labelText (node) (required): Provide an optional label text for the Search icon  
"
  (h/wrapped-factory-apply Search))