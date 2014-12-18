(ns euler-1.core
  (:gen-class))

(defn add_to_sum?
      "add numbers that are multiples of 3 or 5"
      [i]
      (or (zero? (rem i 3)) (zero? (rem i 5)) )

      )

(defn sum_mutliples_of_3_and_5
  [args]

  (loop [[current & rest] args sum 0]
       (if rest
         (if (add_to_sum? current)
             (recur rest (+ sum current))
             (recur rest sum)
           )
         sum
         )
       )
  )

(defn -main
  [& args]
  (println (sum_mutliples_of_3_and_5 (range 1000)))
)
