(defn test [delim lst]
  (doseq [item lst]
    (if (< item delim)
      (println item))))
(test 5 (list 1 2 3))