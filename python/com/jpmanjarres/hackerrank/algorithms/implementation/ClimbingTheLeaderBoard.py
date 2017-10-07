

def binary_search(a, x):
    lo = 0
    hi = len(a)

    while lo < hi:
        mid = (lo+hi)//2
        midval = a[mid]
        if midval > x:
            lo = mid+1
        elif midval < x:
            hi = mid
        else:
            return mid
    return lo


def main():
    n = int(input().strip())
    scores = [int(a) for a in input().strip().split()]
    m = int(input().strip())
    alice = [int(a) for a in input().strip().split()]
    # My code

    scores = sorted(list(set(scores)), reverse=True)

    for a in alice:
        index = binary_search(scores, a)
        print(index+1)

main()
