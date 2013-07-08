(defstruct owes from to amount)

(defun compile-owes (items)
  (do 