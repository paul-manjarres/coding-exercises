n = int(input().strip())

month = 0
day = 0


counts = [31,28,31,30,31,30,31,31,30,31,30,31 ]

if 1700 <= n <= 1917:
    leap = n % 4 == 0

    if leap:
        counts[1] = 29

elif n == 1918:
    counts[1] = 15

elif n >= 1919:
    leap = (n % 400 == 0) or (n % 4 == 0 and n % 100 != 0)

    if leap:
        counts[1] = 29

suma = 0
for i in range(11):
    suma = suma + counts[i]

    if suma + counts[i+1] > 256:
        day = 256-suma
        month = i+2
        break

print("%s.%s.%s" % (day, str(month).zfill(2), n))