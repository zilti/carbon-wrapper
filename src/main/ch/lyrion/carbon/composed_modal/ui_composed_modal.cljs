(ns ch.lyrion.carbon.composed-modal.ui-composed-modal
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ComposedModal/ComposedModal.js" :default ComposedModal]))

(def ui-composed-modal

"Props:
  - onKeyDown (func): Specify an optional handler for the `onKeyDown` event. Called for all
`onKeyDown` events that do not close the modal Default: () => {} 
  - selectorPrimaryFocus (string): Specify a CSS selector that matches the DOM element that should be
focused when the Modal opens Default: '[data-modal-primary-focus]' 
  - className (string): Specify an optional className to be applied to the modal root node  
  - containerClassName (string): Specify an optional className to be applied to the modal node  
  - onClose (func): Specify an optional handler for closing modal.
Returning `false` here prevents closing modal.  
  - open (bool): Specify whether the Modal is currently open  
  - size (enum): Specify the size variant.  
"
  (h/factory-apply ComposedModal))