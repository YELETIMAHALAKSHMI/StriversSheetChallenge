import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int reversePairs(ArrayList<Integer> l) {
        // Write your code here.
        int n=l.size();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(l.get(i)>2*l.get(j))
                count++;
            }
        }
        return count;
    }

}
