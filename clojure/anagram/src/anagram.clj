(ns anagram)

(defn check? [s t]
  (let [w1 (clojure.string/lower-case s) w2 (clojure.string/lower-case t)] 
    (and (not (= w1 w2)) (= (frequencies  w1) 
	(frequencies  w2) ) true)
  )
) 

(defn anagrams-for [word prospect-list] ;; <- arglist goes here
  ;; your code goes here
  (filter #(check? word %) prospect-list)
)
