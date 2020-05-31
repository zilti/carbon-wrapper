(ns ch.lyrion.carbon.ui-shell.ui-side-nav
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNav.js" :default SideNav]))

(def ui-side-nav

"Props:
  - defaultExpanded (bool): If `true`, the SideNav will be open on initial render. Default: false 
  - isPersistent (bool): Specify if the sideNav will be persistent above the lg breakpoint Default: true 
  - isRail (bool): Optional prop to display the side nav rail.  
  - addMouseListeners (bool): Specify whether mouse entry/exit listeners are added. They are by default. Default: true 
  - className (string): Optionally provide a custom class to apply to the underlying <li> node  
  - addFocusListeners (bool): Specify whether focus and blur listeners are added. They are by default. Default: true 
  - isFixedNav (bool): Specify if sideNav is standalone Default: false 
  - translateById (func): Provide a custom function for translating all message ids within this
component. This function will take in two arguments: the mesasge Id and the
state of the component. From this, you should return a string representing
the label you want displayed or read by screen readers. Default: id => {
  const translations = {
    'carbon.sidenav.state.open': 'Close',
    'carbon.sidenav.state.closed': 'Open',
  };
  return translations[id];
} 
  - onToggle (func): An optional listener that is called when an event that would cause
toggling the SideNav occurs.

@param {object} event
@param {boolean} value  
  - expanded (bool): If `true`, the SideNav will be expanded, otherwise it will be collapsed.
Using this prop causes SideNav to become a controled component.  
  - isChildOfHeader (bool): Optionally provide a custom class to apply to the underlying <li> node Default: true 
"
  (h/factory-apply SideNav))