(ns series)

(defn slices [string length] ;; <- arglist goes here
  ;; your code goes here
  (if(> length (count string))
	[]
	(if (= length 0) ([""])
		(let [ans []]
			(loop[x 0]
			(when (<= (+ length x) (count string))
				(conj ans (subs string x (+ x length)))
	
				(recur (inc x))
			))
		ans)
	)
  )
)