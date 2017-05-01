from collections import deque

t = int(input().strip())

for i in range(t):
    n, a, b = int(input().strip()), int(input().strip()), int(input().strip())
    queue = deque([0])

    for j in range(n - 1):
        for _ in range(2 ** j):
            x = queue.popleft()
            queue.append(x + a)
            queue.append(x + b)

    print(*sorted(set(queue)), sep=" ")

