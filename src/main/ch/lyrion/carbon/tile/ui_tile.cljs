(ns ch.lyrion.carbon.tile.ui-tile
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Tile/Tile.js" :default Tile]))

(def ui-tile

"Props:
  - light (bool): `true` to use the light version. For use on $ui-01 backgrounds only.
Don't use this to make tile background color same as container background color. Default: false 
  - children (node): The child nodes.  
  - className (string): The CSS class names.  
"
  (h/factory-apply Tile))