import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
    long leftmax[] = new long[n];
    leftmax[0] = arr[0];
    for(int i=1; i<n; i++) {
        leftmax[i] = Math.max(leftmax[i-1], arr[i]);
    }
    long rightmax[] = new long[n];
    rightmax[n-1] = arr[n-1];
    for(int i=n-2; i>=0; i--) {
        rightmax[i] = Math.max(rightmax[i+1], arr[i]);
    }
    long trapedwater = 0;
    for(int i=0; i<n; i++) {
        long waterlevel = Math.min(leftmax[i], rightmax[i]);
        trapedwater += waterlevel - arr[i];
    }
    return trapedwater;
    }
}
