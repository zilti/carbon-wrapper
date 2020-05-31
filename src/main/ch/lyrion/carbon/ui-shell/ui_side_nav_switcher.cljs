(ns ch.lyrion.carbon.ui-shell.ui-side-nav-switcher
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavSwitcher.js" :default SideNavSwitcher]))

(def ui-side-nav-switcher

"Props:
  - className (string): Provide an optional class to be applied to the containing node  
  - labelText (string) (required): Provide the label for the switcher. This will be the firt visible option
when someone views this control  
  - onChange (func): Provide a callback function that is called whenever the switcher value is
updated  
  - options (arrayOf) (required): Provide an array of options to be rendered in the switcher as an
`<option>`. The text value will be what is displayed to the user and is set
as the `value` prop for each `<option>`.  
"
  (h/factory-apply SideNavSwitcher))