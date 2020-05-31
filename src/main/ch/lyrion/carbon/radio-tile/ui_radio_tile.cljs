(ns ch.lyrion.carbon.radio-tile.ui-radio-tile
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/RadioTile/RadioTile.js" :default RadioTile]))

(def ui-radio-tile

"Props:
  - tabIndex (number): Specify the tab index of the wrapper element Default: 0 
  - name (string): The `name` of the `<input>`.  
  - value (union) (required): The `value` of the `<input>`.  
  - className (string): The CSS class names.  
  - defaultChecked (bool): `true` if the `<input>` should be checked at initialization.  
  - id (string): The ID of the `<input>`.  
  - checked (bool): `true` if this tile should be selected.  
  - onChange (func): The handler of the massaged `change` event on the `<input>`. Default: () => {} 
  - light (bool): `true` to use the light version. Default: false 
  - iconDescription (custom): The description of the tile checkmark icon.  
"
  (h/factory-apply RadioTile))