n = int(input().strip())

arr = [int(i) for i in input().strip().split()]
rev = ""

l = len(arr)

for i in range(0,l):
    rev = rev + str(arr[l-i-1]) + ' '

print(rev)