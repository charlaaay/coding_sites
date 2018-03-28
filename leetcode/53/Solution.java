class Solution {
    public int maxSubArray(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        int[] max = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max[i] = nums[i];
            if (i > 0) {
                //Only use the previous element's max value if it helps
                max[i] = Math.max(max[i], max[i-1] + nums[i]);
            }
        }
        int overallMax = max[0];
        for (int i = 1; i < max.length; i++) {
            overallMax = Math.max(max[i], overallMax);
        }
        return overallMax;
    }
}
