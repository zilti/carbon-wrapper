(ns ch.lyrion.carbon.data-table.ui-table-header
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableHeader.js" :default TableHeader]))

(def ui-table-header

"Props:
  - children (node): Pass in children that will be embedded in the table header label  
  - isSortHeader (bool): Specify whether this header is the header by which a table is being sorted
by  
  - translateWithId (func): Supply a method to translate internal strings with your i18n tool of
choice. Translation keys are avabile on the `translationKeys` field for
this component. Default: (key, { sortDirection, isSortHeader, sortStates }) => {
  if (key === translationKeys.iconDescription) {
    if (isSortHeader) {
      // When transitioning, we know that the sequence of states is as follows:
      // NONE -> ASC -> DESC -> NONE
      if (sortDirection === sortStates.NONE) {
        return 'Sort rows by this header in ascending order';
      }
      if (sortDirection === sortStates.ASC) {
        return 'Sort rows by this header in descending order';
      }

      return 'Unsort rows by this header';
    }
    return 'Sort rows by this header in ascending order';
  }

  return '';
} 
  - scope (string): Specify the scope of this table header. You can find more info about this
attribute at the following URL:
https://developer.mozilla.org/en-US/docs/Web/HTML/Element/th#attr-scope Default: 'col' 
  - isSortable (bool): Specify whether this header is one through which a user can sort the table Default: false 
  - className (string): Specify an optional className to be applied to the container node  
  - colSpan (number): Specify `colSpan` as a non-negative integer value to indicate how
many columns the TableHeader cell extends in a table  
  - sortDirection (enum): Specify which direction we are currently sorting by, should be one of DESC,
NONE, or ASC.  
  - onClick (func): Hook that is invoked when the header is clicked  
"
  (h/factory-apply TableHeader))