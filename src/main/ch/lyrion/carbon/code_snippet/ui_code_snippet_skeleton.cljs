(ns ch.lyrion.carbon.code-snippet.ui-code-snippet-skeleton
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/CodeSnippet/CodeSnippet.Skeleton.js" :default CodeSnippetSkeleton]))

(def ui-code-snippet-skeleton

"Props:
  - type (enum): The type of the code snippet, including single or multi Default: 'single' 
  - className (string): Specify an optional className to be applied to the container node  
"
  (h/factory-apply CodeSnippetSkeleton))