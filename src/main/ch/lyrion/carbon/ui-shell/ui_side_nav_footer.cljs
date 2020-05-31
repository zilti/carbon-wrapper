(ns ch.lyrion.carbon.ui-shell.ui-side-nav-footer
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavFooter.js" :default SideNavFooter]))

(def ui-side-nav-footer

"SideNavFooter is used for rendering the button at the bottom of the side
navigation that is a part of the UI Shell. It is responsible for handling the
user interaction to expand or collapse the side navigation.
Props:
  - assistiveText (string): Provide text to be read to screen readers and shown as a tooltip when
interacting with the toggle button in the footer Default: 'Toggle opening or closing the side navigation' 
  - expanded (bool) (required): Specify whether the side navigation is expanded or collapsed  
  - onToggle (func) (required): Provide a function that is called when the toggle button is interacted
with. Useful for controlling the expansion state of the side navigation.  
  - isSideNavExpanded (bool): Property to indicate if the side nav container is open (or not). Use to
keep local state and styling in step with the SideNav expansion state.  
"
  (h/factory-apply SideNavFooter))