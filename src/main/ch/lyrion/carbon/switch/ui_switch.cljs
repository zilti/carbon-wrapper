(ns ch.lyrion.carbon.switch.ui-switch
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Switch/Switch.js" :default Switch]))

(def ui-switch

"Props:
  - selected (bool): Whether your Switch is selected. Reserved for usage in ContentSwitcher Default: false 
  - text (string): Provide the contents of your Switch Default: 'Provide text' 
  - onClick (func): A handler that is invoked when a user clicks on the control.
Reserved for usage in ContentSwitcher Default: () => {} 
  - onKeyDown (func): A handler that is invoked on the key down event for the control.
Reserved for usage in ContentSwitcher Default: () => {} 
  - className (string): Specify an optional className to be added to your Switch  
  - index (number): The index of your Switch in your ContentSwitcher that is used for event handlers.
Reserved for usage in ContentSwitcher  
  - name (union): Provide the name of your Switch that is used for event handlers  
"
  (h/factory-apply Switch))