class Solution {
    public int climbStairs(int n) {
        
        if (n <= 0) {
            return 1;
        }
        
        int[] steps = new int[n];
        
        for (int i = 0; i < steps.length; i++) {
            if (i == 0) {
                steps[i] = 1;
            } else if (i == 1) {
                steps[i] = 2;
            } else {
                steps[i] = steps[i-1] + steps[i-2];
            }
        }
        return steps[n-1];
    }
}
