n,k = map(int, input().strip().split())
c = [int(ci) for ci in input().strip().split()]
b = int(input())

val = ( sum(c) - c[k] ) // 2

if val == b:
    print("Bon Appetit")
else:
    print(b-val)

