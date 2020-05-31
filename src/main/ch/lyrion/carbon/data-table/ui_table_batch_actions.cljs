(ns ch.lyrion.carbon.data-table.ui-table-batch-actions
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/TableBatchActions.js" :default TableBatchActions]))

(def ui-table-batch-actions

"Props:
  - translateWithId (func): Supply a method to translate internal strings with your i18n tool of
choice. Translation keys are avabile on the `translationKeys` field for
this component. Default: (id, state) => {
  if (id === 'carbon.table.batch.cancel') {
    return translationKeys[id];
  }
  return `${state.totalSelected} ${translationKeys[id]}`;
} 
  - children (node):   
  - className (string):   
  - shouldShowBatchActions (bool): Boolean specifier for whether or not the batch action bar should be
displayed  
  - totalSelected (number) (required): Numeric representation of the total number of items selected in a table.
This number is used to derive the selection message  
  - onCancel (func) (required): Hook required to listen for when the user initiates a cancel request
through this comopnent  
"
  (h/factory-apply TableBatchActions))