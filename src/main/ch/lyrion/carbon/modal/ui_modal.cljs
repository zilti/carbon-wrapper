(ns ch.lyrion.carbon.modal.ui-modal
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Modal/Modal.js" :default Modal]))

(def ui-modal

"Props:
  - secondaryButtonText (string): Specify the text for the secondary button  
  - selectorsFloatingMenus (arrayOf): Specify CSS selectors that match DOM elements working as floating menus.
Focusing on those elements won't trigger \"focus-wrap\" behavior  
  - open (bool): Specify whether the Modal is currently open  
  - focusTrap (custom): Deprecated; Used for advanced focus-wrapping feature using 3rd party library,
but it's now achieved without a 3rd party library.  
  - children (node): Provide the contents of your Modal  
  - passiveModal (bool): Specify whether the modal should be button-less Default: false 
  - modalHeading (node): Specify the content of the modal header title. Default: '' 
  - onRequestSubmit (func): Specify a handler for \"submitting\" modal.
The handler should care of closing modal, e.g. changing `open` prop, if necessary. Default: () => {} 
  - primaryButtonDisabled (bool): Specify whether the Button should be disabled, or not Default: false 
  - onRequestClose (func): Specify a handler for closing modal.
The handler should care of closing modal, e.g. changing `open` prop. Default: () => {} 
  - shouldSubmitOnEnter (bool): Specify if Enter key should be used as \"submit\" action  
  - className (string): Specify an optional className to be applied to the modal root node  
  - size (enum): Specify the size variant.  
  - onSecondarySubmit (func): Specify a handler for the secondary button.
Useful if separate handler from `onRequestClose` is desirable  
  - danger (bool): Specify whether the Modal is for dangerous actions  
  - hasScrollingContent (bool): Specify whether the modal contains scrolling content Default: false 
  - id (string): Specify the DOM element ID of the top-level node.  
  - modalLabel (node): Specify the content of the modal header label. Default: '' 
  - modalAriaLabel (string): Specify a label to be read by screen readers on the modal root node  
  - aria-label (custom): Required props for the accessibility label of the header  
  - onKeyDown (func): Specify a handler for keypresses. Default: () => {} 
  - selectorPrimaryFocus (string): Specify a CSS selector that matches the DOM element that should
be focused when the Modal opens Default: '[data-modal-primary-focus]' 
  - hasForm (bool): Provide whether the modal content has a form element.
If `true` is used here, non-form child content should have `bx--modal-content__regular-content` class.  
  - iconDescription (string): Provide a description for \"close\" icon that can be read by screen readers Default: 'Close' 
  - primaryButtonText (string): Specify the text for the primary button  
"
  (h/factory-apply Modal))