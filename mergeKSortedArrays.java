import java.util.*;
import java.io.*; 
import java.util.ArrayList;  
public class Solution {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k){
        ArrayList<Integer> res = new ArrayList<>();
        while( kArrays.size() != 0 ){
            int min = kArrays.get(0).get(0);
            int index = 0;
            for(int i=0; i<kArrays.size(); i++){
                if( min > kArrays.get(i).get(0)){
                    min = kArrays.get(i).get(0);
                    index = i;
                }
            }
            res.add(min);
            kArrays.get(index).remove(0);
            if( kArrays.get(index).size() == 0 ){
                kArrays.remove(index);
            }
        }  
        return res;
    }
}

 
