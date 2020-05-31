(ns ch.lyrion.carbon.skeleton-text.ui-skeleton-text
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/SkeletonText/SkeletonText.js" :default SkeletonText]))

(def ui-skeleton-text

"Props:
  - paragraph (bool): will generate multiple lines of text Default: false 
  - width (string): width (in px or %) of single line of text or max-width of paragraph lines Default: '100%' 
  - heading (bool): generates skeleton text at a larger size Default: false 
  - lineCount (number): the number of lines in a paragraph Default: 3 
  - className (string): Specify an optional className to be applied to the container node  
"
  (h/factory-apply SkeletonText))