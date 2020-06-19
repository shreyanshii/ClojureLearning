(ns sublist)

(defn classify1 [list1 list2] ;; <- arglist goes here
      ;; your code goes here
	 (let [len (count list1)]
			(some #(= list1 %)
				(partition len 1 list2) )
	  )
)

(defn classify [list1 list2] 
	[list1 list2]
  (if (= list1 list2)
    :equal
    (if (< (count list1) (count list2))
      (if (classify1 list1 list2)
        :sublist
        :unequal)
      (if (classify1 list2 list1)
        :superlist
        :unequal)))
)


