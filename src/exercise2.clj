(ns exercise2)

(defn only-greater-than-five [numbers]
  (filter (fn [x] (< 5 x)) numbers)
)