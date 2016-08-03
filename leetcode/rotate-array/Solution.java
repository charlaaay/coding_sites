import java.util.HashMap;
public class Solution {
    public void rotate(int[] nums, int k) {
    	if(nums.length == 0){
    		return;
    	}
        k = k % nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
        	map.put(i, nums[i]);
        }
        for(int i = 0; i<nums.length; i++){
        	if(i-k<0){
        		nums[i] = map.get(i-k+nums.length);
        	}
        	else{
        		nums[i] = map.get(i-k);
        	}
        }
    }
    public static void main(String[] args){
    	Solution sol = new Solution();
    	int[] dataset = {1,2,3,4,5};
    	sol.rotate(dataset, 1001);
    	for(int i = 0; i<dataset.length;i++){
    		System.out.print(dataset[i] + ", ");
    	}
    }
}
