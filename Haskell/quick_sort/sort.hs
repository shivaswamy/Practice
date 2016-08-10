list []   =  []
list(x:xs) = list ys ++ [x] ++ f zs
              where
                ys = [a | a <- xs, a <= x]
                zs = [b | b <- xs, b > x]
