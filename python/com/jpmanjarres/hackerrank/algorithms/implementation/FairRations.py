N = int(input().strip())
B = [int(B_temp) for B_temp in input().strip().split(' ')]


count = 0
for i in range(N-1):

    if B[i] % 2 != 0:
        B[i] = B[i] + 1
        B[i+1] = B[i+1] + 1
        count = count +2

b = True
for i in range(N):
    if B[i] %2 != 0:
        b = False
        break


if b :
    print(count)
else:
    print("No")