
n = int(input().strip())
heights = [int(height_temp) for height_temp in input().strip().split(' ')]

heights.sort()
count=1
num = heights[n-1]
for i in range(0,n-1):
    if heights[n-2-i] == num:
        count=count+1
    else:
        break;

print(count)



