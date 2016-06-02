N,k = map(int, input().strip().split(" "))

t = list(map(int, input().strip().split(" ")))


#print(type(N))
#print(type(k))
#print(t)

page = 1
specials = 0

for i in range(N):
    problem_number = 1

    #print(" t[i]/k", t[i]//k)
    #print(" t[i]%k", t[i]%k)

    pages = 0
    if t[i] <= k :
        pages = 1
    else:
        pages = (t[i] // k ) + (t[i] % k)

    print("Chapter %d Pages: %d" % (i+1,pages))

    for j in range(pages):

        print("Page ",page," - ",(k*j+1),",",(k*j+k))

        if page >= k*j+1 and page <= k*j+k:
            specials+=1

        page+=1

    print("Specials: ",specials)



