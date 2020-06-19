(ns word-count)

(defn word-count [s] ;; <- arglist goes here
  ;; your code goes here
 (dissoc (frequencies 
           (clojure.string/split 
	 (clojure.string/replace 
		(clojure.string/replace 
			(clojure.string/lower-case s) 
			#"\s{2,}" " ") 
		#"[\,\:\!\&\@\$\%\^\&]" " ") 
	   #" ") 
   )
  "")
)
