#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'connectingTowns' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. INTEGER_ARRAY routes
#

def connectingTowns(n, routes):
    
    result = 1
    mod = 1234567
    for x in routes:
        result = (( result % mod) * (x % mod) ) % mod

    return result

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())
        routes = list(map(int, input().rstrip().split()))
        result = connectingTowns(n, routes)
        fptr.write(str(result) + '\n')
    fptr.close()
