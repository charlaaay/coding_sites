//At each index, see what your gain would be if you sold on that day,
//and the max gain is the answer.

class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length < 2) {
            //Need atleast two indices to have a chance to buy and then sell
            return 0;
        }
        int minValue = prices[0];
        int maxGain = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            }
            if ((prices[i] - minValue) > maxGain) {
                maxGain = prices[i] - minValue;
            }
        }
        return maxGain;
    }
}
