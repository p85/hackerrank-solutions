(defn x2 [n]
  (def newlst ())
  (doseq [i (range 0 n)]
    (def newlst (conj newlst i))
    )
  (println newlst)
  )
(x2 10)