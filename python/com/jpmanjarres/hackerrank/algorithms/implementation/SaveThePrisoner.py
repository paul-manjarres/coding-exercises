t = int(input().strip())
n,m,s = map(int, input().strip().split(" "))

for _ in range(t):
    if s == 1 :
        print(m)
    else:
        index =  ( (m % n) + s - 1 ) % n
        print(index)