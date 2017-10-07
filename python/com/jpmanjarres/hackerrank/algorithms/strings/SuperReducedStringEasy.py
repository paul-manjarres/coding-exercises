
def reduce_string(s):
    temp = ""
    i =0
    while i < len(s):
        if(i == len(s)-1 or s[i] != s[i+1]):
            temp = temp+s[i]
            i = i+1

        elif s[i] == s[i+1]:
            i = i+2
    return temp


s = input().strip()
s2 = reduce_string(s)
t = ""

while len(s2) != 0 and s2 != t:
    t = s2
    s2 = reduce_string(s2)


if len(s2)==0:
    print("Empty String")
else:
    print(s2)