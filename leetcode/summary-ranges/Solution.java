import java.util.List;
import java.util.ArrayList;
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        
    	List<String> list = new ArrayList<String>();
    	
    	int startIndex = 0;
    	int displacement = 0;
    	boolean endOfList = false;
    	for(int i=0; i<nums.length; i++)
    	{
    		if( (endOfList = (i== nums.length-1)? true: false)	|| (nums[startIndex]+displacement+1) != nums[i+1])
    		{
    			//more than 1 consecutive number
    			if(displacement>0){

    				list.add(nums[startIndex] +"->" + nums[i]);
    			}
    			//only 1 consecutive number
    			else{
    				list.add(""+nums[startIndex]);
    			}
    			if(!endOfList){
  
	    			startIndex = i+1; 
	    			displacement = -1;
    			}
    		}
    		displacement++;
    	}
    	return list;
    }
    public static void main(String[] args){
    	
    	Solution test = new Solution();
    	int[] testList = {1,2,3,4,6,7,8,9,10,13,15,16,17,20,23,24};
    	
    	System.out.println(test.summaryRanges(testList));
    	//System.out.println(testList.toString());
    }
}