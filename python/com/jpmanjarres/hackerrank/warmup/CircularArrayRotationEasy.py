
# Algorithm is correct, but Python is not fast enough

'''Rotates the array'''
def rotate(a, k):

    if k<=0:
        return a

    l = len(a)

    effective_rotations = k
    right = True

    #print("k: %s  len: %s" % (k,l))

    if k > l :
        effective_rotations = k % l

    if k > l/2:
        right = False
        effective_rotations = l - effective_rotations

    #print("Effective rotations: %s" %effective_rotations)
    #print("right: %s" % right)

    for j in range(effective_rotations):
        if right:
            rotate_right(a)
        else:
            rotate_left(a)
        #print(a)
    return a

'''Rotate once to right'''
def rotate_right(a):

    l = len(a)
    last = a[l-1]
    temp = a[0]

    for i in range(1, l):
        temp2 = a[i]
        a[i] = temp
        temp = temp2

    a[0] = last

    return a

''' Rotate once to left'''
def rotate_left(a):
    l = len(a)
    first = a[0]

    for i in range(l-1):
        a[i] = a[i+1]

    a[l-1] = first

    return a


n,k,q = map(int, input().strip().split(' '))
a = [int(a_temp) for a_temp in input().strip().split(' ')]
a = rotate(a, k)

for a0 in range(q):
    m = int(input().strip())
    print(a[m])


