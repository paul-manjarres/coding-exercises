x1,v1,x2,v2 = map(int, input().strip().split(" "))

if x1 > x2 and v1 > v2:
    print("NO")
    exit()

if x2 > x1 and v2 > v1:
    print("NO")
    exit()

if v2 - v1 == 0:
     print("NO")
else:
    if abs(x1-x2) % abs(v2 - v1) == 0:
        print("YES")
    else:
        print("NO")