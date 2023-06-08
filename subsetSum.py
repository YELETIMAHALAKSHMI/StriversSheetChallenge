from os import *
from sys import *
from collections import *
from math import *

from typing import List
def subsetSum(num: List[int]) -> List[int]:
    # Write your code here.
    n = len(num)
    res = []
    for i in range(0, 1<<n):
        sum = 0
        for bit in range(0, n):
            if i&(1 << bit):
                sum += num[bit]
        res.append(sum)
    res.sort()
    return res
