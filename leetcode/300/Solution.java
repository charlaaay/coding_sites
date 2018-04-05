class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
      return 0;
    }
    int[] max = new int[nums.length];
    max[0] = 1;
    int overallMax = 1;
    
    for (int i = 0; i < nums.length; i++) {
      max[i] = 1;
      for (int j = i; j >= 0; j--) {
        //every index will look at the previous indexes max, and see if it can top it.
        //the index will store its longest subsequence
        if (nums[i] > nums[j]) {
          //If i'm bigger than you, I'm eligible to be part of your subsequence, so let's check
          //your subsequence and see how big it is, and add onto it.
          if ((max[j] + 1) > max[i]) {
            max[i] = max[j] + 1;
          }
        }
      }
      if (max[i] > overallMax) {
        overallMax = max[i];
      }
    }
    return overallMax;
    }
}
