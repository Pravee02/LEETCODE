class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int buyDay = prices[0];

        for(int sell = 1; sell < prices.length; sell++){
            if(prices[sell] > buyDay){
                int currentProfit = prices[sell] - buyDay;

                if(currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }

            if(prices[sell] < buyDay){
                buyDay = prices[sell];
            }
        }
        return maxProfit;
    }
}