(ns ch.lyrion.carbon.tooltip-definition.ui-tooltip-definition
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TooltipDefinition/TooltipDefinition.js" :default TooltipDefinition]))

(def ui-tooltip-definition

"Props:
  - direction (enum): Specify the direction of the tooltip. Can be either top or bottom. Default: 'bottom' 
  - align (enum): Specify the alignment (to the trigger button) of the tooltip.
Can be one of: start, center, or end. Default: 'start' 
  - children (string) (required): Specify the tooltip trigger text that is rendered to the UI for the user to
interact with in order to display the tooltip.  
  - triggerClassName (string): The CSS class name of the trigger element  
  - id (string): Optionally specify a custom id for the tooltip. If one is not provided, we
generate a unique id for you.  
  - tooltipText (node) (required): Provide the text that will be displayed in the tooltip when it is rendered.
TODO: rename this prop (will be a breaking change)  
"
  (h/factory-apply TooltipDefinition))