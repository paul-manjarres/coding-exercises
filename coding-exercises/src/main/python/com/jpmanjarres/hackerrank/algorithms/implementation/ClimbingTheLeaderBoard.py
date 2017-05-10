
def main():

    n = int(input().strip())
    scores = [int(a) for a in input().strip().split()]
    m = int(input().strip())
    alice = [int(a) for a in input().strip().split()]


    scores = sorted(list(set(scores)), reverse=True)

    for a in alice:

        rank = 1
        found = False
        for i in range(len(scores)):
            if a >= scores[i]:
                print(rank)
                found = True
                break;
            else:
                rank = rank + 1

        if not found:
            print(rank)


main()