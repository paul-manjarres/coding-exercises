from collections import deque

t = int(input().strip())

for i in range(t):
    n, a, b = int(input().strip()), int(input().strip()), int(input().strip())

    queue = deque([0])
    queue2 = deque()

    for j in range(n - 1):

        for k in range(2 ** j):
            queue2.append(queue.pop())

        while len(queue2) > 0:
            x = queue2.pop()
            queue.append(x+a)
            queue.append(x+b)


    print(sorted(set(queue)))

