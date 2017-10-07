n = int(input().strip())
a = [int(i) for i in input().strip().split(" ")]
d,m = map(int, input().strip().split(" "))

count = 0

for i in range(n-m+1):
    sum = 0
    for j in range(i,i+m):
        sum = sum + a[j]
    if sum == d :
        count = count +1
print(count)