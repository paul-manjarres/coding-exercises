n = int(input().strip())

divs = []

curr = 0
summ = 0

maxsum = 0


for i in range(2, n//2 + 1):
    if n % i == 0:
        s = str(i)
        summ = i

        if len(s) > 1:
            summ = 0
            for c in s:
                summ = summ + int(c)

        if summ > maxsum:
            curr = i
            maxsum = summ

        elif summ == maxsum:
            curr = min(curr, i)
            maxsum = summ

print(curr)