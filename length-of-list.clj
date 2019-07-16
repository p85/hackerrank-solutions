(defn test [lst]
  (def i 0)
  (def newlst (vec lst))
  (while (not (= (peek newlst) nil))
    (do
      (def i (inc i))
      (def newlst (pop newlst))))
  println i)
(test ["2" "5" "1" "4" "3" "7" "8" "6" "0" "9"])