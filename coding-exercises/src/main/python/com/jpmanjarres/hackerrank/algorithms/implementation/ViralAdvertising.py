import math

def fun(n):
    if n == 1:
        return 2
    return math.floor((3/2)*fun(n-1))

n = int(input().strip())
s = 0
for i in range(1, n+1):
    s = s + fun(i)
print(s)

