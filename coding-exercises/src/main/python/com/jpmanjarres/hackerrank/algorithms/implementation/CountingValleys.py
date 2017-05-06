n = int(input().strip())
s = input()

count = 0
lev = 0
val = False

for c in s:

    if c == 'U':
        lev = lev + 1
    elif c == 'D':
        lev = lev - 1

    if lev < 0:
        val = True

    if val and lev >= 0:
        count = count + 1
        val = False

print(count)
