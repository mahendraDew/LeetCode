class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int stockBuy = prices[0];
        for(int i = 1; i<prices.length; i++){
            
            if(prices[i] < stockBuy){
               stockBuy = prices[i];
            }else if(prices[i] - stockBuy > maxProfit){
                maxProfit = prices[i] - stockBuy;
            }
            
        }

        return maxProfit;
    }
}