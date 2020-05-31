(ns ch.lyrion.carbon.link.ui-link
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Link/Link.js" :default Link]))

(def ui-link

"Props:
  - children (node): Provide the content for the Link  
  - className (string): Provide a custom className to be applied to the containing <a> node  
  - href (string): Provide the `href` attribute for the <a> node  
  - disabled (bool): Specify if the control should be disabled, or not  
  - inline (bool): Specify whether you want the inline version of this control  
  - visited (bool): Specify whether you want the link to receive visited styles after the link has been clicked  
"
  (h/factory-apply Link))