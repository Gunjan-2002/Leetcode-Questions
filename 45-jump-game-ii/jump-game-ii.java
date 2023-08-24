class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[nums.length];
        // dp[n-1] = 0;

        for(int i=n-2;i>=0;i--){
            int steps = nums[i];
            dp[i] = n;
            for(int j=1;j<=steps && i+j < n;j++){
                dp[i] = Math.min(dp[i] , dp[i+j]);
            }
            dp[i] = dp[i] + 1;
        }
        return dp[0];
    }
}