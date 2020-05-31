(ns ch.lyrion.carbon.accordion.ui-accordion-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Accordion/Accordion.Skeleton.js" :default AccordionSkeleton]))

(def ui-accordion-skeleton

"Props:
  - open (bool): `false` to not display the first item opened Default: true 
  - count (number): Set number of items to render Default: 4 
  - align (enum): Specify the alignment of the accordion heading title and chevron. Default: 'end' 
  - uid (custom): Set unique identifier to generate unique item keys  
  - className (string): Specify an optional className to add.  
"
  (h/factory-apply AccordionSkeleton))