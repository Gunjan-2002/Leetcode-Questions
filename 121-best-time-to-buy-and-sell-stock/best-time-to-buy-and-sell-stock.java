class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int overallprofit = 0;
        int profitIfSoldToday = 0;
        int leastPrice = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(prices[i] < leastPrice){
                leastPrice = prices[i];
            }

            profitIfSoldToday = prices[i] - leastPrice;

            if(profitIfSoldToday > overallprofit){
                overallprofit = profitIfSoldToday;
            }
        }

        return overallprofit;
    }
}