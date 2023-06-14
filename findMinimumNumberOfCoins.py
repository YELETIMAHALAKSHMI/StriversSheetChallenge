from os import *
from sys import *
from collections import *
from math import *
denominations = [1, 2, 5, 10, 20, 50, 100, 500, 1000]
def findMinimumCoins(amount):
    count= 0
    n = len(denominations)-1
    for i in range(n,-1,-1):
        if denominations[i]<=amount:
            while amount>= denominations[i]:
                count+=1
                amount=amount-denominations[i]
        if amount<=0:
            break
    return count   
