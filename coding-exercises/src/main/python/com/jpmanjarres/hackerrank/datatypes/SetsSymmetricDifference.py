N = int(input())
s1 = set(map(int, input().strip().split(" ")))
N = int(input())
s2 = set(map(int, input().strip().split(" ")))

diff1 = s1.difference(s2)
diff2 = s2.difference(s1)
symm = diff1.union(diff2)
li = list(symm)
li.sort()
for i in range(len(li)):
    print(li[i])

