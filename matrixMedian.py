def getMedian(matrix):
    def inarr (arr,val):
        start=0
        end=len(arr)-1
        while start<=end:
            mid=(start+end)//2
            if val>=arr[mid]:
                start=mid+1 
            else:
                end=mid-1
        return start
    n=len(matrix)
    m=len(matrix[0])
    counter=0
    low=1
    high=max([i[-1] for i in matrix])
    while low<=high:
        mid=(low+high)//2
        counter=0
        for i in matrix:
            counter+=inarr(i,mid)
        if (m*n)//2>=counter:
            low=mid+1
        else:
            high=mid-1
    return low
    pass
