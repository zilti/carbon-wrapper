(ns ch.lyrion.carbon.ui-shell.ui-skip-to-content
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/UIShell/SkipToContent.js" :default SkipToContent]))

(def ui-skip-to-content

"Props:
  - children (string): Provide text to display in the SkipToContent `a` tag Default: 'Skip to main content' 
  - href (string): Provide the `href` to the id of the element on your package that is the
main content. Default: '#main-content' 
  - tabIndex (string): Optionally override the default tabindex of 0 Default: '0' 
"
  (h/factory-apply SkipToContent))