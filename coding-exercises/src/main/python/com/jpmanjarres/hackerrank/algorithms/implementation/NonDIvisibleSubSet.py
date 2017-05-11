n, k = map(int, input().strip().split())
s = [int(a) for a in input().strip().split()]

remove = set()

for i in range(n-1):
    for j in range(i,n):
        if i + j % k == 0:
            remove.add(i)

print(n-len(remove))
