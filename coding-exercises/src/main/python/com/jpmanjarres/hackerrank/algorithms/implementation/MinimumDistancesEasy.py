n = int(input().strip())
a = [int(i) for i in input().strip().split()]

minimum_distance=n+1

for i in range(n):
    for j in range(i+1, n):
        if a[i] == a[j] and (j-i) < minimum_distance:
            #print("ai %s , min %s , j %s , i %s" % (a[i],minimum_distance, j, i)  )
            minimum_distance = j-i
            break

if minimum_distance != n+1:
    print(minimum_distance)
else:
    print(-1)
#print(a)