class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0) {
            return 0;
        }
        //I also need to handle this case separately because it wouldn't have a "previous" value
        if (nums.length == 1) {
            if (nums[0] == S || nums[0]*-1 == S) {
                return 1;
            }
            return 0;
        }
        //pass in a dummy 4th param since i handled the above case
        return doRecursion(nums, S, 0, -12345);
    }
    
    //caller must handle empty arrays
    private int doRecursion(int[] nums, int target, int current, int previous) {
        int count = 0;
        if (nums.length == 1) {
            if (nums[0] == 0) {
                //there is some weird base case around 0, so i have to handle this differently
                if (previous == target) {
                    return 1;
                }
                return 0;
            }
            if (current - nums[0] == target) {
                count++;
            } else if (current + nums[0] == target) {
                count++;
            }
            return count;
        }
        
        //assume this value is negative, so subtract from current
        //slice off the first element and repeat
        count += doRecursion(Arrays.copyOfRange(nums, 1, nums.length), target, current - nums[0], nums[0]);
        //assume this value is positve, so add to current
        //slice off the first element and repeat
        count += doRecursion(Arrays.copyOfRange(nums, 1, nums.length), target, current + nums[0], nums[0]);
        return count;
    }
}
