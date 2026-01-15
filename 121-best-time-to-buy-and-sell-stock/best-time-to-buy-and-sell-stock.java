class Solution {
    public int maxProfit(int[] prices) {
        
        // 7 1 5 3 6 4
        // 0 1 2 3 4 5

        int buyPrice = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){

            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;



        


    }
}