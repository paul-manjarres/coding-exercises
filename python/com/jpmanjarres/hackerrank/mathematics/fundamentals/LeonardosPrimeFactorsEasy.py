q = int(input().strip())

primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,
          43,47,53,59,61,67,7173,79,83,89,97,101,103,107,109,113,
          127,131,137,139,149,151,157,163,167,173,
          179,181,191,193,197,199,211,223,227,229,
          233,239,241,251,257]

for i in range(q):
    n = int(input().strip())
    count = 0

    if n == 1:
        print(0)
    else:
        res = 1

        for j in range(len(primes)):
            res2 = res * primes[j]
            if res2 <= n:
                res = res2
                count = count+1
            else:
                break

        print(count)








