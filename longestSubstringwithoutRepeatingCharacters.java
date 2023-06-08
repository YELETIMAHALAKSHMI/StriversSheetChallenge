import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s){
        HashMap<Character,Integer> fmap = new HashMap<>();
        int i =-1,j =-1;
        int n = s.length();
        int max =0;
        while(true){
            boolean flag1 = true,flag2=true;
            while(i<n-1){
                flag1 = false;
                i++;
                char ch = s.charAt(i);
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
                if(fmap.get(ch)>1){
					break;
				}
                else{
                    int len = (i-j);
                    if(len>max)max = len;
                }
            }
            while(j<i){
                flag2 = false;
                j++;
                char ch = s.charAt(j);
                fmap.put(ch,fmap.get(ch)-1);
                if(fmap.get(ch)==1)break;
            }
            if(flag1 && flag2)break;
        }
        return max;
	}
}
