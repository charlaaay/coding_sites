class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0) {
            return 0;
        }
        return doRecursion(nums, 0, S, 0);
    }
    
    //caller must handle empty arrays
    private int doRecursion(int[] nums, int startIndex, int target, int current) {
        int count = 0;
        if (nums.length == startIndex+1) {
            //if the value is 0, it will hit both of these base cases.
            if (current - nums[startIndex] == target) {
                count++;
            }
            if (current + nums[startIndex] == target) {
                count++;
            }
            return count;
        }
        
        //assume this value is negative, so subtract from current
        //slice off the first element and repeat
        count += doRecursion(nums, startIndex+1, target, current - nums[startIndex]);
        //assume this value is positve, so add to current
        //slice off the first element and repeat
        count += doRecursion(nums, startIndex+1, target, current + nums[startIndex]);
        return count;
    }
}
