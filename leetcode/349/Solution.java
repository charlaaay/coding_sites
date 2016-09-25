import java.util.*;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        boolean num1IsSmaller = nums1.length < nums2.length ? true : false;
        int minLength = 0;
        int maxLength = 0;
        if (num1IsSmaller) {
            minLength = nums1.length;
            maxLength = nums2.length;
        } else {
            minLength = nums2.length;
            maxLength = nums1.length;
        }
        int[] intersection = new int[minLength];
        
        if (minLength == 0) {
            return intersection;
        }
        
        for (int i = 0; i< minLength; i++) {
            
            for (int j = 0; j < maxLength; j++) {
                
                if(num1IsSmaller) {
                    if (nums1[i] == nums2[j]) {
                        set.add(nums1[i]);
                        break;
                    }
                } else {
                    if (nums2[i] == nums1[j]) {
                        set.add(nums2[i]);
                        break;
                    }
                }
            }
        }
        Object[] setArray = set.toArray();
        int[] returnMe = new int[setArray.length];
        for (int i = 0; i < returnMe.length; i++) {
            returnMe[i] = (int) setArray[i];
        }
        return returnMe;
    }
}
