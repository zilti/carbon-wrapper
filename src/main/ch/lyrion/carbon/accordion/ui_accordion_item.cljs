(ns ch.lyrion.carbon.accordion.ui-accordion-item
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Accordion/AccordionItem.js" :default AccordionItem]))

(def ui-accordion-item

"Props:
  - open (bool): `true` to open the expando. Default: false 
  - renderExpando (func): The callback function to render the expando button.
Can be a React component class. Default: props => <button {...props} /> 
  - title (node): The accordion title. Default: 'title' 
  - children (node): Provide the contents of your AccordionItem  
  - className (string): Specify an optional className to be applied to the container node  
  - iconDescription (custom): The description of the expando icon.  
  - onClick (func): The handler of the massaged `click` event.  
  - onHeadingClick (func): The handler of the massaged `click` event on the heading.  
"
  (h/factory-apply AccordionItem))