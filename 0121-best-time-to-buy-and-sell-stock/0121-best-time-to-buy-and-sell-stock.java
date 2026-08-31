class Solution {
    public int maxProfit(int[] prices) {
        int  minp=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(minp>prices[i]){
                minp=prices[i];
            }else{
                profit=Math.max(profit,prices[i]-minp);
            }
        }
        return profit;
    }
}