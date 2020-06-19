(ns rna-transcription)

(defn convert [ele]
  (case ele
    "G" "C"
    "C" "G"
    "T" "A"
    "A" "U"
	(throw (AssertionError. (str "Not valid: " ele)))
    ))



(defn to-rna [dna]
  (if (empty? dna)
    dna
    (str (convert (subs dna 0 1)) (to-rna (subs dna 1) ) )
  )
)

