(ns ch.lyrion.carbon.tabs.ui-tabs
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Tabs/Tabs.js" :default Tabs]))

(def ui-tabs

"Props:
  - role (string): By default, this value is \"navigation\". You can also provide an alternate
role if it makes sense from the accessibility-side Default: 'navigation' 
  - children (node): Pass in a collection of <Tab> children to be rendered depending on the
currently selected tab  
  - selected (number): Optionally provide an index for the currently selected <Tab> Default: 0 
  - triggerHref (string): Provide a string that represents the `href` for the triggered <Tab> Default: '#' 
  - tabContentClassName (string): Provide a className that is applied to the <TabContent> components  
  - type (enum): Provide the type of Tab Default: 'default' 
  - className (string): Provide a className that is applied to the root <nav> component for the
<Tabs>  
  - onSelectionChange (func): Provide an optional handler that is called whenever the selection
changes. This method is called with the index of the tab that was
selected  
  - hidden (bool): Specify whether the Tab content is hidden  
  - selectionMode (enum): Choose whether or not to automatically change selection on focus Default: 'automatic' 
  - ariaLabel (string): Specify the text to be read by screen-readers when visiting the <Tabs>
component Default: 'listbox' 
  - onKeyDown (func): Optionally provide an `onKeyDown` handler that is invoked when keyed
navigation is triggered  
  - iconDescription (string): Provide a description that is read out when a user visits the caret icon
for the dropdown menu of items Default: 'show menu options' 
  - onClick (func): Optionally provide an `onClick` handler that is invoked when a <Tab> is
clicked  
"
  (h/factory-apply Tabs))