(ns ch.lyrion.carbon.progress-indicator.ui-progress-step
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ProgressIndicator/ProgressIndicator.js" :default ProgressStep]))

(def ui-progress-step

"Props:
  - description (string): Provide a description for the <ProgressStep>  
  - index (number): Index of the current step within the ProgressIndicator  
  - disabled (bool): Specify whether the step is disabled  
  - translateWithId (func): Optional method that takes in a message id and returns an
internationalized string. Default: function translateWithId(messageId) {
  return defaultTranslations[messageId];
} 
  - invalid (bool): Specify whether the step is invalid  
  - className (string): Provide an optional className to be applied to the containing <li> node  
  - label (node) (required): Provide the label for the <ProgressStep>  
  - current (bool): Specify whether the step is the current step  
  - tooltipId (string): The ID of the tooltip content.  
  - complete (bool): Specify whether the step has been completed  
  - secondaryLabel (string): Provide an optional secondary label  
  - renderLabel (func):  Default: props => <p {...props} /> 
  - onClick (func): A callback called if the step is clicked or the enter key is pressed  
  - overflowTooltipProps (object): Provide the props that describe a progress step tooltip  
"
  (h/factory-apply ProgressStep))