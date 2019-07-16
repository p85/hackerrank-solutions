(defn test [num lst]
  (doseq [item lst] (doseq [i (range num)] (println item))))
(test 3 (list 1 2 3 4))