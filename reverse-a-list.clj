(defn rl [lst]
  (defn abs [n] (max n (- n)))
  (def newlst ())
  (doseq [i (range 0 (count lst))]
    (def pos (abs (+ 1 (- i (count lst)))))
    (println (nth lst pos))))
(rl [19 22 3 28 26 17 18 4 28 0])