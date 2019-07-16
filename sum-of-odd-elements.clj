(defn test [lst]
  (def result 0)
  (doseq [i (range 0 (count lst))]
    (if (= (bit-and (nth lst i) 1) 1)
      (def result (+ result (nth lst i))))
    )
  println result
  )
(test [2 3 2 4 6 5 7 8 0 1])