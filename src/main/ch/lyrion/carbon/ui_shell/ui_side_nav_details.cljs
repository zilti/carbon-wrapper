(ns ch.lyrion.carbon.ui-shell.ui-side-nav-details
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SideNavDetails.js" :default SideNavDetails]))

(def ui-side-nav-details

"Props:
  - className (string): Optionally provide a custom class to apply to the underlying <li> node  
  - children (node): Provide optional children to render in `SideNavDetails`. Useful for
rendering the `SideNavSwitcher` component.  
  - title (string) (required): Provide the text that will be rendered as the title in the component  
"
  (h/factory-apply SideNavDetails))