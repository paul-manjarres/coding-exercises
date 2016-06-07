N,k = map(int, input().strip().split(" "))
t = list(map(int, input().strip().split(" ")))

page = 1
specials = 0

for i in range(N):
    problem_number = 1

    #print(" t[i]/k: ", t[i]//k," t[i]%k: ", t[i]%k)

    pages = 0

    if t[i] <= k :
        pages = 1
    else:
        pages = (t[i] // k ) + (t[i] % k)

    #print("Chapter %d Pages: %d" % (i+1,pages))

    for j in range(pages):

        problems_per_page = 0
        if t[i] >= k*(j+1):
            problems_per_page = k
        else:
            problems_per_page = t[i] % k

        #print("Page ",page," - ",(k*j+1),",",(k*j+k)," - t[i] ",t[i], " Problems_page: ",problems_per_page)

        if t[i] > k and page >= k*j+1 and page <= k*j+problems_per_page:
            specials+=1
        elif t[i] <= k and page >= 1 and page <= t[i]:
            specials+=1

        page+=1


print(specials)



