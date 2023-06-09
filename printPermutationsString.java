import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Solution { 
    public static List<String> findPermutations(String s) {
        List<String> ans = new ArrayList<String>(); 
        helper(s, "", ans);
        return ans;
    }
   public static void helper(String input, String soFar, List<String> ans) {
       if (input.length() == 0) {
            ans.add(soFar);
            return;
        }
        for (int i = 0; i < input.length(); i++) { 
            char ch = input.charAt(i);
            String leftPart = input.substring(0, i);
            String rightPart = input.substring(i + 1);
            helper(leftPart + rightPart, ch + soFar, ans);
        }
    }

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String input = in.next();
        List<String> permutations = findPermutations(input);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}  
