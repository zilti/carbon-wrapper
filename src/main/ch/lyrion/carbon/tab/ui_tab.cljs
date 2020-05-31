(ns ch.lyrion.carbon.tab.ui-tab
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Tab/Tab.js" :default Tab]))

(def ui-tab

"Props:
  - role (string): Provide an accessibility role for your Tab Default: 'presentation' 
  - renderAnchor (func):   
  - selected (bool): Whether your Tab is selected.
Reserved for usage in Tabs Default: false 
  - tabIndex (number): Specify the tab index of the <a> node Default: 0 
  - index (number): The index of your Tab in your Tabs. Reserved for usage in Tabs  
  - disabled (bool): Whether your Tab is disabled.  
  - renderContent (func):  Default: TabContent 
  - handleTabClick (func): A handler that is invoked when a user clicks on the control.
Reserved for usage in Tabs  
  - className (string): Specify an optional className to be added to your Tab  
  - handleTabKeyDown (func): A handler that is invoked on the key down event for the control.
Reserved for usage in Tabs  
  - label (node): Provide the contents of your Tab Default: 'provide a label' 
  - id (string): The element ID for the top-level element.  
  - onKeyDown (func): Provide a handler that is invoked on the key down event for the control Default: () => {} 
  - onClick (func): Provide a handler that is invoked when a user clicks on the control Default: () => {} 
  - href (string): Provide a string that represents the `href` of the Tab Default: '#' 
"
  (h/factory-apply Tab))