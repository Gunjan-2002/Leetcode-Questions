class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int buyingDay = 0;
        int sellingDay = 0;
        int maxProfit = 0;

        for(int i=1;i<n;i++){
            if(prices[i] >= prices[i-1]){
                sellingDay++;
            }
                maxProfit += prices[sellingDay] - prices[buyingDay];
                buyingDay = sellingDay = i;
        }

        return maxProfit;

        //  if (prices == null || prices.length <= 1) {
        //     return 0;
        // }

        // int totalProfit = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i - 1] < prices[i]) {
        //         totalProfit += prices[i] - prices[i - 1];
        //     }
        // }

        // return totalProfit;
    }
}