class Solution {
    public int maxProfit(int[] prices) {
       int maxprof = 0;
       int buystk = prices[0];
       for(int i=1;i<prices.length;i++){
        if(prices[i]<buystk){
            buystk = prices[i];
        }else if(prices[i]-buystk>maxprof){
            maxprof = prices[i]-buystk;
        }
       }
            return maxprof;
    }
}