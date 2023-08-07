class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int dp[][] = new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(matrix[i-1][j-1] == '1'){
                    int min = Integer.MAX_VALUE;
                    min = Math.min(min , dp[i-1][j]);
                    min = Math.min(min , dp[i-1][j-1]);
                    min = Math.min(min , dp[i][j-1]);

                    dp[i][j] = min+1;
                    ans = Math.max(ans , dp[i][j]);
                }
            }
        }
        return ans*ans;
    }
}