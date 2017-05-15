n, m = map(int, input().strip().split(' '))
c = [int(c_temp) for c_temp in input().strip().split(' ')]

maxi = 0
curr = 0

c = sorted(c)

for i in range(n):
    if i in c:
        curr = 0
    else:
        mini = n
        for j in c:
            mini = min(abs(i-j), mini)

        maxi = max(mini, maxi)

print(maxi)
