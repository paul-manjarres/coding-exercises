
for i in range(int(input().strip())) :

    s = input().strip()
    p = ""
    cost = 0

    for i in range(len(s)):
        found = False
        for c in p:
            if c == s[i]:
                p = p + c
                found = True
                break


        if not found:
            p = p+s[i]
            cost = cost+1

    print(cost)

