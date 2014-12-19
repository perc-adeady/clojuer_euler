(ns euler-2.core
  (:gen-class))

(defn sum_even_fib
    []

    (loop [sum 0 first 1 second 2]
          (if (<  second 4000000 )
            (do
              (if (even? second)
                (recur (+ sum second) second (+ first second))
                (recur sum second (+ first second))
                )
              )
            sum
            )
          )
    )

(defn -main

  [& args]
  (println "Euler 2!")
  (println (sum_even_fib))
  )