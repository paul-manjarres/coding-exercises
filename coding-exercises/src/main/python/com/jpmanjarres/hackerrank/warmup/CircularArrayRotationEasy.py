
'''Rotates the array'''
def rotate(a, k):
    if k<=0:
        return a

    l = len(a)
    effective_rotations = k

    if k > l :
        effective_rotations = l % k

    for j in range(effective_rotations):

        last = a[l-1]
        temp = a[0]

        for i in range(1, l):
            temp2 = a[i]
            a[i] = temp
            temp = temp2

        a[0] = last

    return a


n,k,q = map(int, input().strip().split(' '))
a = [int(a_temp) for a_temp in input().strip().split(' ')]
a = rotate(a, k)

for a0 in range(q):
    m = int(input().strip())
    print(a[m])


