(ns ch.lyrion.carbon.accordion.ui-accordion
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Accordion/Accordion.js" :default Accordion]))

(def ui-accordion

"Props:
  - align (enum): Specify the alignment of the accordion heading title and chevron. Default: 'end' 
  - children (node): Pass in the children that will be rendered within the Accordion  
  - className (string): Specify an optional className to be applied to the container node  
"
  (h/factory-apply Accordion))