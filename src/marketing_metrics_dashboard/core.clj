(ns marketing-metrics-dashboard.core
  (:gen-class
   :name de.novatec.MarketingMetricsDashboard
   :methods [[handler [String] String]])
  (:require [clojure.java.io :as io]))

(defn -handler [in]
  (slurp (io/resource "index.html")))
