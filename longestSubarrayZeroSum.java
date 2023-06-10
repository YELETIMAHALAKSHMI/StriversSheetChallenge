import java.io.*;
import java.util.* ;
import java.util.ArrayList;
public class Solution {
	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		// Write your code here.
		int sum = 0, max = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
            if(sum == 0){
                max = i + 1;
            }
			else{
                if(map.get(sum) != null){
                    max = Math.max(max , i - map.get(sum));
                }
				else{
                    map.put(sum , i);
                }
            }
        }
        return max;
	}
}
