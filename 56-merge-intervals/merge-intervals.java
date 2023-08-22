class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        ArrayList<int[]> ans = new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            if(i == 0){
                ans.add(intervals[i]);
            }else{
                int pre[] = ans.get(ans.size()-1);

                if(intervals[i][0] <= pre[1]){
                    pre[1] = Math.max(pre[1] , intervals[i][1]);
                }else{
                    ans.add(intervals[i]);
                }
            }         
        }
        return ans.toArray(new int[ans.size()][]);
    }
}