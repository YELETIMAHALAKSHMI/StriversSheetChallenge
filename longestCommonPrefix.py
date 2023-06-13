import os
def longestCommonPrefix(arr, n):
    prefix=os.path.commonprefix(arr)
    if prefix==None:
        prefix=''
    return prefix


