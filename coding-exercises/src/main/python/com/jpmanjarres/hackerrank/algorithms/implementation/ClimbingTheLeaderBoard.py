

def get_leaderboard(n, scores):

    board = []
    max = scores[0]
    curr = 1
    for i in range(n):
        if scores[i] == max:
            board.append(curr)
        else:
            max = scores[i]
            curr = curr + 1
            board.append(curr)

    return board


def main():

    n = int(input().strip())
    scores = [int(a) for a in input().strip().split()]
    m = int(input().strip())
    alice = [int(a) for a in input().strip().split()]

    for a in alice:
        sc = scores.copy()
        sc.append(a)
        sc = sorted(sc, reverse=True)
        ind = sc.index(a)
        board = get_leaderboard(len(sc), sc)
        print(board[ind])

main()