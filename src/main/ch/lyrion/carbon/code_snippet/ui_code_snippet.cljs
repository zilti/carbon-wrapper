(ns ch.lyrion.carbon.code-snippet.ui-code-snippet
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/CodeSnippet/CodeSnippet.js" :default CodeSnippet]))

(def ui-code-snippet

"Props:
  - copyButtonDescription (string): Specify the description for the Copy Button  
  - children (string): Provide the content of your CodeSnippet as a string  
  - feedback (string): Specify the string displayed when the snippet is copied  
  - copyLabel (string): Specify a label to be read by screen readers on the containing <textbox>
node  
  - showMoreText (string): Specify a string that is displayed when the Code Snippet text is more
than 15 lines Default: 'Show more' 
  - type (enum): Provide the type of Code Snippet Default: 'single' 
  - showLessText (string): Specify a string that is displayed when the Code Snippet has been
interacted with to show more lines Default: 'Show less' 
  - className (string): Specify an optional className to be applied to the container node  
  - ariaLabel (string): Specify a label to be read by screen readers on the containing <textbox>
node  
  - light (bool): Specify whether you are using the light variant of the Code Snippet,
typically used for inline snippet to display an alternate color  
  - onClick (func): An optional handler to listen to the `onClick` even fired by the Copy
Button  
"
  (h/factory-apply CodeSnippet))