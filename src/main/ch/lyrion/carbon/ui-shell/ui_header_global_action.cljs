(ns ch.lyrion.carbon.ui-shell.ui-header-global-action
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/HeaderGlobalAction.js" :default HeaderGlobalAction]))

(def ui-header-global-action

"HeaderGlobalAction is used as a part of the `HeaderGlobalBar`. It is
essentially an Icon Button with an additional state to indicate whether it is
\"active\". The active state comes from when a user clicks on the global action
which should trigger a panel to appear.

Note: children passed to this component should be an Icon.
Props:
  - children (node) (required): Provide a custom icon for this global action  
  - className (string): Optionally provide a custom class name that is applied to the underlying
button  
  - onClick (func): Optionally provide an onClick handler that is called when the underlying
button fires it's onclick event  
  - isActive (bool): Specify whether the action is currently active  
"
  (h/factory-apply HeaderGlobalAction))