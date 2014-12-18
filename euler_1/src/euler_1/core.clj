(ns euler-1.core
  (:gen-class))


(defn multiple_3?
      [i]
      (zero? (rem i 3))
      )

(defn multiple_5?
      [i]
      (zero? (rem i 5))
      )

(defn add_to_sum?
      [i]
      (or (multiple_3? i) (multiple_5? i) )

      )

(defn inc_sum
      [current sum]
      (if (add_to_sum? current)
        (+ sum current)
        )

  )

(defn id
      [i]
      i)

(defn my_function
  [args sum]

  (def retVal
    (let [[current & rest] args]
         (if rest
           (if (add_to_sum? current)
             (do
               (my_function rest (inc_sum current sum))
               )
             (do
               (my_function rest sum)
               )
             )
           (id sum)
           )
         )
    )

  retVal

  )


(defn -main
  [& args]
  (println (my_function [1 2 3 4 5 6 7 8 9 10] 0))
)
