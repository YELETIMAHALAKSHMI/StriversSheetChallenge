import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        List<int[]> meets = new ArrayList<int[]>(start.size());
        for (int i = 0; i < start.size(); i++) {
            meets.add(new int[] { start.get(i), end.get(i) });
        }
        meets.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                return a1[1] - a2[1];
            }
        });
        int count = 0;
        int endTime = 0;
        for (int[] meet : meets) {
            if (meet[0] >= endTime) {
                count++;
                endTime = meet[1];
            }
        }
        return count;
    }
}
