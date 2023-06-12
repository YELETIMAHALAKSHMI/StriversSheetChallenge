import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        int n = intervals.length;
        ArrayList<Interval> ans = new ArrayList<Interval>();
        if(intervals.length == 0 || intervals == null) {
            return ans;
        }
        Arrays.sort(intervals, (a, b) -> a.start - b.start);
        int start = intervals[0].start;
        int end = intervals[0].finish;
        for(Interval interval : intervals) {
            if(interval.start <= end) {
                end = Math.max(end, interval.finish);
            }
            else {
                ans.add(new Interval(start, end));
                start = interval.start;
                end = interval.finish;
            }
        }
        ans.add(new Interval(start, end));
        return ans;
    }
}
