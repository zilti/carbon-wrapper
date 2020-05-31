(ns ch.lyrion.carbon.copy-button.ui-copy-button
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/CopyButton/CopyButton.js" :default CopyButton]))

(def ui-copy-button

"Props:
  - iconDescription (string): Provide a description for the icon representing the copy action that can
be read by screen readers Default: 'Copy to clipboard' 
  - feedback (string): Specify the string that is displayed when the button is clicked and the
content is copied Default: 'Copied!' 
  - feedbackTimeout (number): Specify the time it takes for the feedback message to timeout Default: 2000 
  - onClick (func): Specify an optional `onClick` handler that is called when the underlying
<button> is clicked Default: () => {} 
  - className (string): Specify an optional className to be applied to the underlying <button>  
"
  (h/factory-apply CopyButton))