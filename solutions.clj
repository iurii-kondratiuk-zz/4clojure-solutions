;; 1. Nothing but the Truth

true

;; 2. Flatten a SequenceSimple Math

4

;; 3. Intro to Strings

"HELLO WORLD"

;; 4. Intro to Lists

:a :b :c

;; 5. Lists: conj

'(1 2 3 4)

;; 6. Intro to Vectors

:a :b :c

;; 7. Vectors: conj

[1 2 3 4]

;; 8. Intro to Sets 

#{:a :b :c :d}

;; 9. Sets: conj

2

;; 10. Intro to Maps

20

;; 11. Maps: conj 

{:b 2}

;; 12. Intro to Sequences

3

;; 13. Sequences: rest

[20 30 40]

;; 14. Intro to Functions

8

;; 15. Double Down

#(* % 2)

;; 16. Hello World

#(str "Hello, " %)

;; 17. Sequences: map

'(6 7 8)

;; 18. Sequences: filter 

'(6 7)

;; 19. Last Element

#(first (reverse %))

;; 52. Intro to Destructuring

[c e]

;; 64. Intro to Reduce

+

;; 134. A nil key


(fn [k, m] (and (contains? m k) (= (m k) nil)))

;; 156. Map Defaults

(fn [v, m] (into {} (map #(hash-map % v) m)))

;; 161. Subset and Superset

#{1 2}

;; 162. Logical falsity and truth

1
 
