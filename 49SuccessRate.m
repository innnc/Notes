x = rand(m, n)
y = x
y(x <= 0.49) = -1
y(x > 0.49) = 1
fundend = sum(y) * bet + fund
