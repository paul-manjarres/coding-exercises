#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    t = int(input().strip())

    for t_itr in range(t):

        first_multiple_input = input().rstrip().split()
        n = int(first_multiple_input[0])
        k = int(first_multiple_input[1])

        for i in range(n):
            val = (n-1-i//2)*((i+1)%2) + (i-1)//2*(i%2)
            #print("val: ", val, " i:", i)
            if val == k:
                print(i)
                break

    # n 0 n-1 1 n-2 2 n-3 3 ... 
    # 0 1  2  3  4  5  6  7

    # (n-k/2)*(k+1%2) + (k-1)/2*(k%2)  


