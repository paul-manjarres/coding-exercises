s = input().strip()
n = int(input().strip())
s_len = len(s)

a = 0
a_ = 0

n_mod_s = int(n % s_len)
n_div_s = n // s_len

for c in s:
    if c == 'a':
        a = a +1

for c in s[0:n_mod_s]:
    if c == 'a':
        a_ = a_ +1

print(a*n_div_s + a_)
