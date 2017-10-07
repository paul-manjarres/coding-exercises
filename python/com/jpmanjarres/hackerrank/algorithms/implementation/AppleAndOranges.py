s, t = input().strip().split(' ')
s, t = [int(s), int(t)]
a, b = input().strip().split(' ')
a, b = [int(a), int(b)]
m, n = input().strip().split(' ')
m, n = [int(m), int(n)]
apple = [int(apple_temp) for apple_temp in input().strip().split(' ')]
orange = [int(orange_temp) for orange_temp in input().strip().split(' ')]

count_apples = 0
count_oranges = 0

# Check apples
for i in range(m):
    d = a + apple[i]

    if s <= d <= t:
        count_apples = count_apples + 1

# Check oranges
for i in range(n):
    d = b + orange[i]

    if s <= d <= t:
        count_oranges = count_oranges + 1

print(count_apples)
print(count_oranges)
