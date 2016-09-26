public class Solution {
    public int findKthLargest(int[] nums, int k) {
       
       if (nums.length == 0) {
           return -1;
       }
       int max = nums[0];
       int maxIndex = 0;
       for (int i = 0; i < k; i++) {
           max = nums[0];
           maxIndex = 0;
           for (int j = 0; j< nums.length; j++) {
               if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
               }
           }
           nums[maxIndex] = Integer.MIN_VALUE;
       }
       return max;
    }
}
