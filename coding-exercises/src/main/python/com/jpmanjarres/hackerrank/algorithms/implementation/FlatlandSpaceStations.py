# Flatland Space Stations

n, m = map(int, input().strip().split(' '))
c = [int(c_temp) for c_temp in input().strip().split(' ')]

maxi = 0
c = sorted(c)

for i in range(m-1):
    maxi = max(abs(c[i]-c[i+1]), maxi)

maxi = maxi // 2
maxi = max(abs(0-c[0]), maxi)
maxi = max(abs(c[m-1] - (n-1)), maxi)

print(maxi)
