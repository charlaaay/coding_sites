public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        for (int i = 0; i<nums.length;i++) {
            nums[length] = nums[i];
            while (i < nums.length-1 && nums[i] == nums[i+1]) {
                i++;
            }
            length++;
        }
        return length;
    }
}
