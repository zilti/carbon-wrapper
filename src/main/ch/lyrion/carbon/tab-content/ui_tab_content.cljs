(ns ch.lyrion.carbon.tab-content.ui-tab-content
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TabContent/TabContent.js" :default TabContent]))

(def ui-tab-content

"Props:
  - selected (bool): Specify whether the TabContent is selected Default: false 
  - className (string): Provide a className for the tab content container  
  - children (node): Pass in content to render inside of the TabContent  
"
  (h/factory-apply TabContent))