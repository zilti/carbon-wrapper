(ns ch.lyrion.carbon.ui-shell.ui-content
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/Content.js" :default Content]))

(def ui-content

"Props:
  - tagName (string): Optionally specify the tag of the content node. Defaults to `main` Default: 'main' 
  - className (string): Optionally provide a custom class name that is applied to the container  
  - children (node): Provide children nodes to be rendered in the content container  
"
  (h/factory-apply Content))