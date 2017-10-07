N = int(input())
L = []
for i in range(N):
    C = input().split()
    
    if C[0] == "insert": 
        L.insert(int(C[1]),int(C[2]))
    elif C[0] == "print":
        print(L)
    elif C[0] == "remove":
        L.remove(int(C[1]))
    elif C[0] == "append":
        L.append(int(C[1]))
    elif C[0] == "sort":
        L.sort()
    elif C[0] == "reverse":
        L.reverse()
    elif C[0] == "pop":
        L.pop()