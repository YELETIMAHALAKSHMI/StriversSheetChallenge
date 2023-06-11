import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        long ans = 1;
        long x1 = x;
        while(n>0){
            if(n%2 !=0){
                ans = ((ans)%m *(x1)% m ) %m;
            }
            x1 = ((x1)%m *(x1)%m)%m;
            n= n>>1;
        }  
        return(int)(ans%m);

    }

}    
