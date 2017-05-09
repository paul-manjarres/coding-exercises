import math

n = int(input().strip())
angle = math.pi

for _ in range(n):
    px, py, qx, qy = map(int, input().strip().split())
    x = px - qx
    y = py - qy
    x2 = x*math.cos(angle) - y*math.sin(angle) + qx
    y2 = x*math.sin(angle) + y*math.cos(angle) + qy
    print("%s %s" % (round(x2), round(y2)))

