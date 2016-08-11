n = a `div` length xs
    where
      a = 10
      xs = [1,2,3,4,5]


n1 = a `div` length xs
  where a = 10
        xs = [1,2,3,4,5]

--------------------------------------------------------------------------------
-- Reverse Quick sort exercises

--Solution 1
qsort1 [] = []
qsort1 (x: xs) = qsort1 larger ++ [x] ++ qsort1 smaller
  where smaller = [a | a <- xs, a <= x]
        larger = [b | b <- xs, b > x]

--Solution 2
qsort2 [] = []
qsort2 (x : xs) =  reverse (reverse(qsort2 smaller) ++ [x] ++ reverse(qsort2 larger))
  where smaller = [a | a <- xs, a <= x]
        larger = [b | b <- xs, b > x]


--Solution 3
qsort3 [] = []
qsort3 (x : xs) = qsort3 larger ++ [x] ++ qsort3 smaller
  where larger = [a | a <- xs, a > x || a == x]
        smaller = [b | b <- xs, b < x]

--------------------------------------------------------------------------------
