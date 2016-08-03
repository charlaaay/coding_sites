//returns true if the input array contains duplicates

import java.util.HashSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hash = new HashSet<Integer>();

        for(int i = 0;i<nums.length;i++){

           if(hash.contains(nums[i])){

               return true;
           }
           hash.add(nums[i]);
        }
        return false;
    }

	public static void main(String[] args){

		Solution test = new Solution();
		int[] testData = {1,2,3,4,5,6,1};
		if(test.containsDuplicate(testData)){
			System.out.println("Duplicate");
		}else{
			System.out.println("No duplicates");
		}
		
	}
}

