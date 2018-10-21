//TIME LIMIT EXCEEDED
class Solution {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 0) {
            //no length, zero points.
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;
        int pointsEarned;
        int numberOfElementsToDelete = 0;
        int debugIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            pointsEarned = nums[i];
            
            int[] newArray = generateNewArray(nums, i);
            pointsEarned+= deleteAndEarn(newArray);
            if (pointsEarned > maxValue) {
                debugIndex = i;
                maxValue = pointsEarned;
            }
        }
        return maxValue;
    }
    
    private int[] generateNewArray(int[] nums, int index)
    {   
        //count of items to be deleted
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] == nums[index] -1 || nums[i] == nums[index] +1) {
               count++;
           }
        }
        //delete an extra for the original index
        int[] newArray = new int[nums.length - count - 1];
        int j = 0; //currentNewArrayIndex;
        for (int i = 0; i < nums.length; i++) {
            if (i == index || nums[i] == nums[index] -1 || nums[i] == nums[index] +1) {
                continue;
            }
            newArray[j] = nums[i];
            j++;
        }
        return newArray;
    }
}
