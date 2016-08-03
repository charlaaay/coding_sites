public class Solution {

    public int missingNumber(int[] nums) {
        if(nums.length == 1 && nums[0] == 1) {
            System.out.println("This statement ran");
            return 0;
        }
        int sum = 0;
        
        for(int i = 0; i<nums.length; i++) { 
            
            sum =  (sum ^ nums[i] ^ i);
        }
        sum = (sum ^ nums.length);
        
        return sum;
    }
}
