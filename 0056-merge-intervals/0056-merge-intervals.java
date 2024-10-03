class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));
        int n = intervals.length;
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] <= intervals[i-1][1]){
                intervals[i][1] = Math.max(intervals[i][1], intervals[i-1][1]);
                intervals[i][0] = intervals[i-1][0];
                intervals[i-1][0] = -1;
                intervals[i-1][1] = -1;
                n--;
            }
        }
        int[][] ans = new int[n][2];
        int i = 0;
        for(int[] interval: intervals){
            if(interval[0] != -1){
                ans[i][0] = interval[0];
                ans[i][1] = interval[1];
                i++;
            }
        }
        return ans;
    }
}