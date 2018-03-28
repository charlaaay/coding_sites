#Bottom up DP
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        if (cost.length == 0) {
            return 0;
        }
        
        int[] minCosts = new int[cost.length];
        for (int i = 0; i< cost.length; i++) {
            if (i <= 1) {
                //We can start at either of these floors
                minCosts[i] = cost[i];
                continue;
            }
            minCosts[i] = Math.min(minCosts[i-1], minCosts[i-2]) + cost[i];
        }
        
        if (cost.length < 2) {
            return minCosts[0];
        }
        return Math.min(minCosts[cost.length-1], minCosts[cost.length-2]);
    }
}
