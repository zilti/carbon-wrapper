(ns ch.lyrion.carbon.tile-group.ui-tile-group
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TileGroup/TileGroup.js" :default TileGroup]))

(def ui-tile-group

"Props:
  - onChange (func): Provide an optional `onChange` hook that is called whenever the value of
the group changes Default: () => {} 
  - children (node): Provide a collection of <RadioTile> components to render in the group  
  - className (string): Provide an optional className to be applied to the container node  
  - defaultSelected (union): Specify the the value of <RadioTile> to be selected by default  
  - name (string) (required): Specify the name of the underlying <input> nodes  
  - disabled (bool): Specify whether the group is disabled  
  - legend (string): Provide an optional legend for this group  
  - valueSelected (union): Specify the value that is currently selected in the group  
"
  (h/factory-apply TileGroup))