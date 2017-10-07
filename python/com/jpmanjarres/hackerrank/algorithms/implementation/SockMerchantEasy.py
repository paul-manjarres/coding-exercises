n = int(input().strip())
c = sorted([int(i) for i in input().strip().split()])

pairs = 0
current = c[0]
p = 1

for i in range(1, len(c)):
    if c[i] == current:
        p = p+1
    else:
        pairs = pairs + (p // 2)
        p = 1

    current = c[i]

pairs = pairs + (p // 2)

print(pairs)

