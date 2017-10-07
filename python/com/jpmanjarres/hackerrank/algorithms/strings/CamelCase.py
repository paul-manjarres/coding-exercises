s = input().strip()

words = 1

for c in s:
    if c.isupper():
        words = words+1

print(words)