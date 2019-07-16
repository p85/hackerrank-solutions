(def n (Integer/parseInt (clojure.string/trim (read-line))))

(doseq [n-itr (range n)]
  (def x (Double/parseDouble (clojure.string/trim (read-line))))

  (println
   (+ 1 (/ (* x (+ 1 (/ (* x (+ 1 (/ (* x (+ 1 (/ (* x (+ 1 (/ (* x (+ 1 (/ (* x (+ 1 (/ (* x (+ 1 (/ (* x (+ 1 (/ (* x 1.0) 9))) 8))) 7))) 6))) 5))) 4))) 3))) 2))) 1))))