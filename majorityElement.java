import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        int vote=0,candidate=-1;
        for(int i=0;i<n;i++){
            if(vote==0){
                candidate=arr[i];
                vote++;
            }
            else{
                if(candidate==arr[i]){
                    vote++;
                }
                else{
                    vote--;
                }
            }
        }

        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==candidate){
                cnt++;
            }
        }
        if(cnt>n/2){
            return candidate;
        }
        else{
            return -1;
        }
	}
}
