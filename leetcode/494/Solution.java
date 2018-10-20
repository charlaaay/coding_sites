class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0) {
            return 0;
        }
        return doRecursion(nums, S, 0);
    }
    
    //caller must handle empty arrays
    private int doRecursion(int[] nums, int target, int current) {
        if (nums.length == 0) {
            if (current == target) {
                return 1;
            }
            return 0;
        }
        int count = 0;
        //assume this value is negative, so subtract from current
        //slice off the first element and repeat
        count += doRecursion(Arrays.copyOfRange(nums, 1, nums.length), target, current - nums[0]);
        //assume this value is positve, so add to current
        //slice off the first element and repeat
        count += doRecursion(Arrays.copyOfRange(nums, 1, nums.length), target, current + nums[0]);
        return count;
    }
}
