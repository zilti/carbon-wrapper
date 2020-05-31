(ns ch.lyrion.carbon.fluid-form.ui-fluid-form
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/FluidForm/FluidForm.js" :default FluidForm]))

(def ui-fluid-form

"Props:
  - children (node): Provide children to be rendered inside of the <form> element  
  - className (string): Provide a custom className to be applied on the containing <form> node  
"
  (h/factory-apply FluidForm))