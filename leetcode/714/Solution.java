/**

Recurrence relation = prices[i] - fee + maxProfit(i+1, fee);

This is a suffix problem ^, so you fill in the array from start to finish, and then return the last element in teh array

*/
class Solution {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length == 0) {
            return 0;
        }
        int[] sitout = new int[prices.length];
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        int[] held = new int[prices.length];
        
        
        for (int i = 0; i < prices.length; i++) {
            buy[i] = -prices[i] -fee;
            held[i] = Integer.MIN_VALUE;
            sell[i] = Integer.MIN_VALUE;
            sitout[i] = 0;
            
            if (i-1 >= 0) {
                sitout[i] = Math.max(sitout[i-1], sell[i-1]);
                sell[i] = Math.max(buy[i-1], held[i-1]) + prices[i];
                buy[i] = Math.max(sell[i-1], sitout[i-1]) - prices[i] - fee;
                held[i] = Math.max(buy[i-1], held[i-1]);
            }
        }
        return Math.max(sitout[prices.length-1],Math.max(sell[prices.length-1], held[prices.length-1]));
    }
}
