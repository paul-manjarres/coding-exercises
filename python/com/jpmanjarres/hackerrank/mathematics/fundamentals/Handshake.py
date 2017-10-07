
import math

T = int(input().strip())
for a0 in range(T):
    N = int(input().strip())

    if N == 1:
        print(0)
    else:
        print(math.factorial(N) // (2*math.factorial(N-2)))

