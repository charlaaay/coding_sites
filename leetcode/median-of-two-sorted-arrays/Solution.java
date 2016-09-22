import java.lang.Math.*;
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double totalSize = nums1.length + nums2.length;
        if (totalSize == 0) {
            return 0.0;
        }

        boolean isEven = totalSize % 2 == 0 ? true : false;
        int startIndex = (int)(Math.ceil(totalSize / 2) -1);
        int endIndex = isEven ? startIndex+1 : startIndex;
        int nums1Index, nums2Index, number1, number2;
        nums1Index = nums2Index = number1 = number2 = 0;
        double temp, temp1;
        temp = temp1 = 0;
        for (int i = 0; i <= endIndex; i++) {
            if (nums1Index >= nums1.length) {
                number2 = nums2[nums2Index];
                temp = temp1;
                temp1 = number2;
                nums2Index++;
                continue;
            } else if(nums2Index >= nums2.length) {
                number1 = nums1[nums1Index];
                temp = temp1;
                temp1 = number1;
                nums1Index++;
                continue;
            }

            number1 = nums1[nums1Index];
            number2 = nums2[nums2Index];
            if (number2 < number1) {
                temp = temp1;
                temp1 = number2;
                nums2Index++;
            } else {
                temp = temp1;
                temp1 = number1;
                nums1Index++;
            }
        }
        if (isEven) {
            return (double)((temp + temp1) / 2);
        } else {
            return temp1;
        }
    }
}
