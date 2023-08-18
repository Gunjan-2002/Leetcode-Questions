class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestTillNow = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < lowestTillNow){
                lowestTillNow = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - lowestTillNow); 
        }
        return maxProfit;
    }
}