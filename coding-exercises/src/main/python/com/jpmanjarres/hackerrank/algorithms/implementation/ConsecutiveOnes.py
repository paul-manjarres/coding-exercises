
n = int(input().strip())
binary = "{0:b}".format(n)
a = [int(i) for i in binary]
count = 0
maxi = 0

for i in a:

    if i == 1:
        count = count + 1
    else:
        count = 0

    maxi = max(count, maxi)

print(maxi)
