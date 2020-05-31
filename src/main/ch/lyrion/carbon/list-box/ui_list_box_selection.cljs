(ns ch.lyrion.carbon.list-box.ui-list-box-selection
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ListBox/ListBoxSelection.js" :default ListBoxSelection]))

(def ui-list-box-selection

"`ListBoxSelection` is used to provide controls for clearing a selection, in
addition to conditionally rendering a badge if the control has more than one
selection.
Props:
  - translateWithId (func): i18n hook used to provide the appropriate description for the given menu
icon. This function takes in an id defined in `translationIds` and should
return a string message for that given message id. Default: id => defaultTranslations[id] 
  - disabled (bool): Specify whether or not the clear selection element should be disabled  
  - clearSelection (func) (required): Specify a function to be invoked when a user interacts with the clear
selection element.  
  - selectionCount (number): Specify an optional `selectionCount` value that will be used to determine
whether the selection should display a badge or a single clear icon.  
  - onClick (func): Specify an optional `onClick` handler that is called when the underlying
clear selection element is clicked  
  - onKeyDown (func): Specify an optional `onKeyDown` handler that is called when the underlying
clear selection element fires a keydown event  
"
  (h/factory-apply ListBoxSelection))