(ns ch.lyrion.carbon.grid.ui-row
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Grid/Row.js" :default Row]))

(def ui-row

"Props:
  - as (union): Provide a custom element to render instead of the default <div> Default: 'div' 
  - condensed (bool): Specify a single row as condensed.Rows that are adjacent
and are condensed will have 2px of margin between them to match gutter. Default: false 
  - className (string): Specify a custom className to be applied to the `Row`  
  - children (node): Pass in content that will be rendered within the `Row`  
"
  (h/factory-apply Row))