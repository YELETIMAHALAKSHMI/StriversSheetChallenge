from math import *
from collections import *
from sys import *
from os import *

def lengthOfLongestConsecutiveSequence(arr, n):
    arr = list(set(arr))
    arr.sort()
    count = max_count = 1
    if len(arr) == 1:
        return 1
    for i in range(len(arr) - 1):
        if arr[i] + 1 == arr[i + 1]:
            count += 1
        else:
            count = 1
        max_count = max(count, max_count)
    return max_count
