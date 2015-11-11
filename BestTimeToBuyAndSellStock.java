public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        
        int currentMin = prices[0];
        int maxProfit = 0;
        
        for(int i=0;i<prices.length; i++){
            currentMin = Math.min(currentMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - currentMin);
        }
        
        return maxProfit;
    }
}
