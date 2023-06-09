import java.util.ArrayList;
import java.util.Collections;
public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		Collections.sort(arr);
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(arr.get(k-1));
		res.add(arr.get(arr.size()-k));
		return res;
		}
}
