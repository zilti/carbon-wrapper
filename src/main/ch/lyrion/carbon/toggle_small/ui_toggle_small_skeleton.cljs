(ns ch.lyrion.carbon.toggle-small.ui-toggle-small-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ToggleSmall/ToggleSmall.Skeleton.js" :default ToggleSmallSkeleton]))

(def ui-toggle-small-skeleton

"Props:
  - aria-label (string):  Default: 'Toggle is loading' 
  - id (string): Provide an id that unique represents the underlying <input>  
  - labelText (string): Provide the text that will be read by a screen reader when visiting this
control
`aria-label` is always required but will be null if `labelText` is also
provided  
  - className (string): Specify an optional className to add to the form item wrapper.  
"
  (h/factory-apply ToggleSmallSkeleton))