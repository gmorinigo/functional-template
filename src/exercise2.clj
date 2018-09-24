(ns exercise2)

(defn only-greater-than-five
  [elem]
    (def f-filtro (fn [x] (< x 6) ))
    (if (empty? elem) 
        ()    
        (filter
            f-filtro elem)
    ;(if (empty? elem) 
    ;    ()
    ;    (if (< (first elem) 6) 
    ;        (only-greater-than-five (rest elem))
    ;        ;;else
    ;        (conj '(6) only-greater-than-five (rest elem))
    ;        ;;'(6 7)
    ;    )
    )
)

