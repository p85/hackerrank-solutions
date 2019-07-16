(defn x1 [lst]
  (for [i (range 0 (count lst))]
    (if (= (bit-and i 1) 1)
      (println (nth lst i))
    ))
)
(x1 (list 2 5 3 4 6 7 9 8))