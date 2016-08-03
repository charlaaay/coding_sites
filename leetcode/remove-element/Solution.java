public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length ==0) {
            return 0;
        }
        int replaceIndex = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == val) {
                replaceIndex = grabNextNumber(nums, i, val);
                swap(nums, i, replaceIndex);
            }
        }
        int i = 0;
        while((i<nums.length) && nums[i] != val ) {
            i++;
        }
        return i;
    }
    public static int grabNextNumber(int[] nums, int startingIndex, int avoidMe) {
        int i = startingIndex;
        while ((i<nums.length-1) && nums[i] == avoidMe) {
            i++;
        }
        return i;
    }
    public static int[] swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        return nums;
    }
}
