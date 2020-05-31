(ns ch.lyrion.carbon.grid.ui-grid
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Grid/Grid.js" :default Grid]))

(def ui-grid

"Props:
  - as (union): Provide a custom element to render instead of the default <div> Default: 'div' 
  - condensed (bool): Collapse the gutter to 2px. Useful for fluid layouts.
Rows have 2px of margin between them to match gutter. Default: false 
  - fullWidth (bool): Remove the default max width that the grid has set Default: false 
  - className (string): Specify a custom className to be applied to the `Grid`  
  - children (node): Pass in content that will be rendered within the `Grid`  
"
  (h/factory-apply Grid))