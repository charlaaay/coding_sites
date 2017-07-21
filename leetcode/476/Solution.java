public class Solution {
    public int findComplement(int num) {
        int temp = 0;
        int max = Integer.bitCount(num);
        int i = 0;
        int val = 0;
        int counter = 0;
        while (i < max) {
            if ((num & 1) == 0) {
                val = (1 << counter);
                temp +=  val;
            } else {
                i++;
            }
            counter++;
            num = num >> 1;
        }
        return temp;
    }
}
