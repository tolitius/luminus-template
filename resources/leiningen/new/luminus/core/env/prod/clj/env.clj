(ns <<project-ns>>.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[<<name>> started successfully]=-"))
   :middleware identity})
