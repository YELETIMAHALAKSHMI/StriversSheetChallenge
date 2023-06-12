import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        ArrayList<Integer> store = new ArrayList<Integer>();
        int[] medians = new int[n];
        for (int i = 0; i < n; i++) {
            store.add(arr[i]);
            Collections.sort(store);
            int median;
            if ((i + 1) % 2 == 0) {
                median = (store.get(i / 2) + store.get((i + 1) / 2)) / 2;
            }
            else {
                median = store.get(i / 2);
            }
            medians[i] = (median);
        }
        return medians;
    }
}
