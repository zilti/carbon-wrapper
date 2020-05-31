(ns ch.lyrion.carbon.copy.ui-copy
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Copy/Copy.js" :default Copy]))

(def ui-copy

"Props:
  - feedback (string): Specify the string that is displayed when the button is clicked and the
content is copied Default: 'Copied!' 
  - feedbackTimeout (number): Specify the time it takes for the feedback message to timeout Default: 2000 
  - onClick (func): Specify an optional `onClick` handler that is called when the underlying
<button> is clicked Default: () => {} 
  - children (node): Pass in content to be rendred in the underlying <button>  
  - className (string): Specify an optional className to be applied to the underlying <button>  
"
  (h/factory-apply Copy))