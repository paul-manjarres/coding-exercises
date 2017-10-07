n,d = map(int, input().strip().split())
a = [int(ai) for ai in input().strip().split()]

triplets = 0

for i in range(n-2):
    b = a[i] + d

    if b in a:
        c = b + d

        if c in a:
            triplets = triplets + 1

print(triplets)


