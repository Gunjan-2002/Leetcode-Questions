class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum += nums[i];
        }

        if(sum %2 != 0){
            return false;
        }

        if(n < 2){
            return false;
        }

        int half = sum/2;

        boolean dp[][] = new boolean[n+1][half+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    dp[i][j]=true;
                }else{
                    if(dp[i-1][j] == true){
                        dp[i][j]=true;
                    }else{
                        int val = nums[i-1];
                        if(j >= val){
                            if(dp[i-1][j-val] == true){
                                dp[i][j]=true;
                            }
                        }
                    }
                }
            }
        }

        return dp[n][half];
    }
}