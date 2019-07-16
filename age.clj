(ns predicter)
(defn predict-age [age1 age2 age3 age4 age5 age6 age7 age8]
  (def tmp
    (+ (* age7 age7) (* age8 age8)
       (+ (* age5 age5) (* age6 age6)
          (+ (* age3 age3) (* age4 age4)
             (+ (* age1 age1) (* age2 age2))))))
  (int (/ (Math/sqrt tmp) 2)))
(predict-age 65 60 75 55 60 63 64 45)