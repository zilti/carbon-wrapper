(ns ch.lyrion.carbon.tooltip-icon.ui-tooltip-icon
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/TooltipIcon/TooltipIcon.js" :default TooltipIcon]))

(def ui-tooltip-icon

"Props:
  - direction (enum): Specify the direction of the tooltip. Can be either top or bottom. Default: 'bottom' 
  - align (enum): Specify the alignment (to the trigger button) of the tooltip.
Can be one of: start, center, or end. Default: 'center' 
  - children (node) (required): Specify an icon as children that will be used as the tooltip trigger. This
can be an icon from our Icon component, or a custom SVG element.  
  - id (string): Optionally specify a custom id for the tooltip. If one is not provided, we
generate a unique id for you.  
  - tooltipText (string) (required): Provide the ARIA label for the tooltip.
TODO: rename this prop (will be a breaking change)  
"
  (h/factory-apply TooltipIcon))