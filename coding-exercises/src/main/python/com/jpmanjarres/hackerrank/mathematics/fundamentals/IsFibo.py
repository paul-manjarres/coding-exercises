t = int(input().strip())

fibos = [0,1]
j = 2
num0 = 0
while num0< 10**10:
    num0 = fibos[j-1] + fibos[j-2]
    fibos.append(num0)
    j = j+1


for _ in range(t):

    n = int(input().strip())

    if n in fibos:
        print("IsFibo")
    else:
        print("IsNotFibo")

