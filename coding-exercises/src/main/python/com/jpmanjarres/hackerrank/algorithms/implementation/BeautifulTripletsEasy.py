n,d = map(int, input().strip().split())
a = [int(ai) for ai in input().strip().split()]

triplets=0

for i in range(n-2):

    for j in range(i+1, n-1):

        if a[i]+d == a[j]:

            for k in range(j+1,n):

                if a[j]+d == a[k]:
                    triplets = triplets +1
                    break


print(triplets)


