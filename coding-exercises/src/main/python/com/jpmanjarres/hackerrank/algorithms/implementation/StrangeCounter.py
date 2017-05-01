
def get_initial_cycle_number(i):
    return 3*(2**i)

n = int(input().strip())
cycle = 0

start = get_initial_cycle_number(cycle)-2
end = 2*start + 1

while n > end:
    cycle = cycle + 1
    start = get_initial_cycle_number(cycle) - 2
    end = 2 * start + 1

x = get_initial_cycle_number(cycle) - n + start
print(x)
