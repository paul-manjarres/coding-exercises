import re

s = input().strip()
s_array= [ s1 for s1 in re.findall('...', s) if s1 != 'SOS' ]
count=0

for x in s_array:
    count = count + (x[0] != 'S') + (x[1] != 'O') + (x[2] != 'S')

print(count)
