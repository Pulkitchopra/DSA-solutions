public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {

        Arrays.sort(intervals, (a,b) -> a.start - b.start);





        ArrayList<Interval> ans = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++){

            if(ans.isEmpty() || intervals[i].start > ans.get(ans.size() - 1).finish){

                ans.add(new Interval(intervals[i].start, intervals[i].finish));
            }
            else{

                int max = Math.max(ans.get(ans.size() - 1).finish, intervals[i].finish);

                ans.get(ans.size() - 1).finish = max;
            }
        }
        return ans;

    }
}
