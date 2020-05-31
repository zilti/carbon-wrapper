(ns ch.lyrion.carbon.tag.ui-tag
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Tag/Tag.js" :default Tag]))

(def ui-tag

"Props:
  - children (node): Provide content to be rendered inside of a <Tag>  
  - className (string): Provide a custom className that is applied to the containing <span>  
  - type (enum): Specify the type of the <Tag>  
  - disabled (bool): Specify if the <Tag> is disabled  
  - filter (bool): Determine if <Tag> is a filter/chip  
  - title (string): Text to show on clear filters  
  - onClose (func): Click handler for filter tag close button.  
"
  (h/factory-apply Tag))