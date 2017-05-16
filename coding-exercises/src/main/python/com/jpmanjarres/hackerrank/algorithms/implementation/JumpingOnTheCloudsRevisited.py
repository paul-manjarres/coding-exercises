n, k = input().strip().split(' ')
n, k = [int(n), int(k)]
c = [int(c_temp) for c_temp in input().strip().split(' ')]

curr = 0
energy = 100

end = False

while curr < n:
    curr = curr + k
    energy = energy - 1

    if curr == n:
        curr = 0
        end = True

    if c[curr] == 1:
        energy = energy - 2

    if end:
        break

print(energy)
