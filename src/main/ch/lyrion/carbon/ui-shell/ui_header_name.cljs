(ns ch.lyrion.carbon.ui-shell.ui-header-name
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/HeaderName.js" :default HeaderName]))

(def ui-header-name

"Props:
  - prefix (string): Optionally specify a prefix to your header name. Useful for companies, for
example: IBM [Product Name] versus solely [Product Name] Default: 'IBM' 
  - children (node) (required): Pass in children that are either a string or can be read as a string by
screen readers  
  - className (string): Optionally provide a custom class to apply to the underlying <li> node  
  - href (string): Provide an href for the name to link to  
"
  (h/factory-apply HeaderName))