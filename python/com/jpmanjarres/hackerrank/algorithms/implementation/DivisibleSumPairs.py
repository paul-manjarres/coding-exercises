
n, k = map(int, input().strip().split())
a = [ int(t) for t in input().strip().split() ]

pairs = 0

'''
#Easy and concise
for i in range(len(a)):
    for j in range(i+1, len(a)):
        #print("%d , %d"%(a[i], a[j]))
        if (a[i]+a[j]) % k == 0:
            pairs=pairs+1


print(pairs)
'''

# More complex
for i in range(len(a)):
    pairs = pairs + sum( [ b for b in [(a[i]+a[j]) % k == 0 for j in range(i+1,len(a)) ] if b ] )

print(pairs)