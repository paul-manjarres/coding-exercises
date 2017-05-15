n = int(input().strip())
c = [int(c_temp) for c_temp in input().strip().split(' ')]

steps = 0
curr = 0

while curr < n - 1:

    if curr + 2 <= n - 1:
        if c[curr + 2] == 0:
            curr = curr + 2
        else:
            curr = curr + 1
    else:
        curr = curr + 1

    steps = steps + 1

print(steps)
