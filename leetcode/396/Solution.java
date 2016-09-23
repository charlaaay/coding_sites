public class Solution {
    public int maxRotateFunction(int[] A) {
        int counter, max, innerCount;
        counter = max = innerCount = 0;

        for (int i = 0; i< A.length; i++) {
            counter = 0;
            innerCount = 0;
            for (int j = i; innerCount <  A.length; innerCount++, j++) {
                if (j == A.length) {
                    j = 0;
                }
                counter += innerCount * A[j];
            }
            //i == 0 because we initially want to store the max
            if (counter > max || i == 0) {
                max = counter;
            }
        }
        return max;
    }
}
