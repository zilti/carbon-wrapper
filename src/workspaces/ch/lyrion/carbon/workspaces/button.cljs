(ns ch.lyrion.carbon.workspaces.button
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.dom :as dom]
            [fulcro.client.primitives :as fp]
            [fulcro.client.mutations :as fm]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [nubank.workspaces.ui.core :as uc]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.card-types.react :as ct.react]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [nubank.workspaces.ui.core :as uc]
            [ch.lyrion.carbon.ui-button :refer [ui-button]]))

(def state (atom {::text "Hi Carbon."}))

(comp/defsc CarbonButtonFulcro
  [this props]
  {};;{:ident (fn [] [::id "singleton"])}
  (dom/div {}
           (ui-button {:children [(::text @state)]})))

(ws/defcard carbon-button-fulcro
  {::wsm/init
   (fn [card]
     (let [fulcro-card (ct.fulcro/fulcro-card-init card {::ct.fulcro/wrap-root? false
                                                         ::ct.fulcro/root CarbonButtonFulcro})]
       (assoc fulcro-card
              ::wsm/render-toolbar
              (fn []
                (dom/div "Test.")))))})

#_(ws/defcard carbon-button-fulcro
    (ct.fulcro/fulcro-card
     {::ct.fulcro/wrap-root? false
      ::ct.fulcro/root CarbonButtonFulcro}))

(comp/defsc CarbonButtonAtom
  [this props]
  {};;{:ident (fn [] [::id "singleton"])}
  (dom/div {}
           (ui-button {:children ["(::text @state)"]})))

(defn CarbonButtonReact [state-atom]
  (fn []
    (dom/div {}
             (ui-button {:children [(::text @state-atom)]}))))

(ws/defcard carbon-button-react
  (let [state-atom (atom {::text "Hi Carbon."})]
    {::wsm/init
     (fn [card]
       (let [react-card (ct.react/react-card-init card state-atom (CarbonButtonReact state-atom))]
         (assoc react-card
                ::wsm/render-toolbar
                (fn []
                  (dom/div
                   (uc/button {:onClick #(swap! state-atom assoc ::text "Hi React.")} "Hah."))))))}))
