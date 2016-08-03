/*
Given an array of integers and an integer k, 
find out whether there there are two distinct indices i and j in the array 
such that nums[i] = nums[j] and the difference between i and j is at most k.
*/


import java.util.HashMap;
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i<nums.length; i++){

        	//System.out.println("Checking key: " + nums[i] + " value: " + i);
        	if(map.containsKey(nums[i])){
        		if(i-map.get(nums[i])<=k){
        			return true;
        		}
        	}
       		map.put(nums[i],i);
        }
        return false;
    }

}