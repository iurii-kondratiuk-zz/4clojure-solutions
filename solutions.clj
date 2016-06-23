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

;; 20. Penultimate Element

#(second (reverse %))

;; 21. Nth Element

(fn [l, i] (first (drop i l)))

;; 22. Count a Sequence

#(reduce (fn [acc, el] (inc acc)) 0 %)

;; 23. Reverse a Sequence

#(reduce (fn [acc, el] (conj acc el)) [] %)

;; 24. Sum It All Up

#(reduce (fn [acc, n] (+ acc n)) 0 %)

;; 25. Find the odd numbers

#(filter (fn [i] (= (mod i 2) 1)) %)

;; 26. Fibonacci Sequence

;; -- with reduce 
(fn [n]
  (let [r (range (- n 2))]
    (reduce (fn [acc, i] (conj acc (apply + (drop i acc)))) [1 1] r)))

;; -- with iterate
#(take % (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))

;; 27. Palindrome Detector

#(= (seq %) (reverse (seq %)))

;; 29. Get the Caps

#(apply str (re-seq #"[A-Z]+" %))

;; 32. Duplicate a Sequence

(fn [sq] (mapcat #(list % %) sq))

;; 38. Maximum value

(fn [& params] (last (sort params)))

;; 48. Intro to some

6

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
 
