(ns ch.lyrion.carbon.form.ui-form
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/Form/Form.js" :default Form]))

(def ui-form

"Props:
  - children (node): Provide children to be rendered inside of the <form> element  
  - className (string): Provide a custom className to be applied on the containing <form> node  
"
  (h/factory-apply Form))