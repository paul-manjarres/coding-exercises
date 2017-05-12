s, n, m = map(int, input().strip().split())
keyboards = list(map(int, input().strip().split(' ')))
drives = list(map(int, input().strip().split(' ')))

mx = 0

for i in range(n):
    for j in range(m):
        suma = keyboards[i]+drives[j]
        if suma <= s and suma > mx:
            mx = suma

if mx == 0:
    print(-1)
else:
    print(mx)
