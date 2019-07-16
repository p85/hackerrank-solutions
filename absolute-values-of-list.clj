(defn test [lst]
  (defn abs [n] (max n (- n)))
  (doseq [i (range 0 (count lst))] 
    (println (abs (nth lst i)))
    )
  )
(test [2 -4 3 -1 23 -4 -54])