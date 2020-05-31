(ns ch.lyrion.carbon.ui-shell.ui-link
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/Link.js" :default Link]))

(def ui-link

"Link is a custom component that allows us to supporting rendering elements
other than `a` in our markup. The goal is to allow users to support passing
in their own components to support use-cases like `react-router` or
`@reach/router`
Props:
  - element (elementType): The base element to use to build the link. Defaults to `a`, can also accept
alternative tag names or custom components like `Link` from `react-router`. Default: 'a' 
  - isSideNavExpanded (bool): Property to indicate if the side nav container is open (or not). Use to
keep local state and styling in step with the SideNav expansion state.  
"
  (h/factory-apply Link))