(ns ch.lyrion.carbon.modal-wrapper.ui-modal-wrapper
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ModalWrapper/ModalWrapper.js" :default ModalWrapper]))

(def ui-modal-wrapper

"Props:
  - secondaryButtonText (string):  Default: 'Cancel' 
  - children (node):   
  - modalText (string):   
  - disabled (bool):  Default: false 
  - passiveModal (bool):   
  - triggerButtonIconDescription (string):  Default: 'Provide icon description if icon is used' 
  - handleOpen (func):   
  - handleSubmit (func):   
  - modalHeading (string):   
  - shouldCloseAfterSubmit (bool):   
  - renderTriggerButtonIcon (union):   
  - buttonTriggerClassName (string):   
  - status (string):   
  - id (string):   
  - withHeader (bool):   
  - triggerButtonKind (enum):  Default: 'primary' 
  - modalLabel (string):   
  - buttonTriggerText (node):   
  - onKeyDown (null): null Default: () => {} 
  - selectorPrimaryFocus (null): null Default: '[data-modal-primary-focus]' 
  - modalBeforeContent (bool):   
  - primaryButtonText (string):  Default: 'Save' 
"
  (h/factory-apply ModalWrapper))