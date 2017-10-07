a = list(map(int, input().strip().split(" ")))
b = list(map(int, input().strip().split(" ")))

a_points=0
b_points=0

for i in range(len(a)):
    if a[i] > b[i]:
       a_points=a_points+1
    elif a[i] < b[i]:
        b_points=b_points+1

print("%d %d" % (a_points, b_points) )