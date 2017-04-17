t = int(input().strip())

for _ in range(t):

    n = int(input().strip())
    z = n-1
    x = z - z%3
    y = z - z%5
    v = z - z%15
    sum3 = int(x*(x+3)//6)
    sum5 = int(y*(y+5)//10)
    sum15 = int(v*(v+15)//30)
    print(sum3+sum5-sum15)