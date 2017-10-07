
n = int(input().strip())

for i in range(n):
    s = input()
    even = ''
    odd = ''

    for j, c in enumerate(s):
        if j%2 == 0 :
            even = even + c
        else:
            odd = odd + c

    print("%s %s" % (even, odd))

