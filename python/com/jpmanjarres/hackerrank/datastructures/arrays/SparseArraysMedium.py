'''
<a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal
2016-10-04
'''
n = int(input())
s = {}

for i in range(n):
    word = input().strip()
    if word in s:
        count = s.get(word)
        s[word] = count +1
    else:
        s[word] = 1

q = int(input())

for i in range(q):
    qi = input().strip()
    if(qi in s):
        print(s[qi])
    else:
        print(0)


