class Solution {
    public int maxProduct(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        int[] maxes = new int[nums.length];
        int[] mins = new int[nums.length];
        maxes[0] = nums[0];
        mins[0] = nums[0];
        
        int overallMax = maxes[0];
        int n1, n2;
        for (int i = 1; i< nums.length; i++) {
            n1 = Math.max(mins[i-1] * nums[i], maxes[i-1] * nums[i]);
            n2 = Math.min(mins[i-1] * nums[i], maxes[i-1] * nums[i]);
            
            n1 = Math.max(n1, nums[i]);
            n2 = Math.min(n2, nums[i]);
            
            maxes[i] = n1;
            mins[i] = n2;
            
            if (maxes[i] > overallMax) {
                overallMax = maxes[i];
            }
        }
        return overallMax;
    }
}
