
def getRecord(s):
    # Complete this function

    max = s[0]
    min = s[0]

    cmax = 0
    cmin = 0

    for i in s:

        if i > max:
            cmax = cmax + 1
            max = i

        if i < min:
            cmin = cmin + 1
            min = i

    return [ cmax, cmin]


n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
result = getRecord(s)
print (" ".join(map(str, result)))