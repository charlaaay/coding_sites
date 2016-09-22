import java.util.Arrays;
public class runner
{

  public static void main(String[] args) {
    Solution sol = new Solution();

    int[][] nums1 = {{1,2,3,4,5}, {}, {10}, {}, {1,3},{1}, {3}};
    int[][] nums2 = {{1,2,3,4,5},{1,2,3,4,5}, {}, {}, {2}, {1}, {1}};
    double[] expected = {3.0, 3.0, 10.0, 0.0, 2, 1, 2};

    double result = 0;
    for (int i = 0; i< nums1.length; i++) {
        result = sol.findMedianSortedArrays(nums1[i], nums2[i]);
        if (expected[i] != result) {
            System.out.println("---------------");
            System.out.println("Input: " + Arrays.toString(nums1[i]));
            System.out.println("second Input: " + Arrays.toString(nums2[i]));
            System.out.println("Expected: " + expected[i]);
            System.out.println("Result: " + result);
            System.out.println("---------------");
        }
    }
  }
}
