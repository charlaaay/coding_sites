public class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int total = 1;
        int numberOfZeros = 0;
        int[] returnMe = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 0){
                numberOfZeros++;
            }else{
                total *= nums[i];
            }
        }
        if(numberOfZeros > 1){
            int[] temp = new int[nums.length];
            return temp;
        }
        for(int i = 0; i<nums.length;i++){
            if(numberOfZeros == 1 && nums[i] != 0){
                returnMe[i] = 0;
            }
            else if(nums[i] == 0){
                returnMe[i] = total;
            }
            else{
                returnMe[i] = total / nums[i];
            }
        }
        return returnMe;
    }
}