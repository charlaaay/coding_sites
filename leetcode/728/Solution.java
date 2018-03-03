import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> returnMe = new ArrayList<Integer>();
        for (int i = left; i<= right; i++) {
            if (this.isSelfDividingNumber(i)) {
                returnMe.add(new Integer(i));
            }
        }
        return returnMe;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        for (Integer num : sol.selfDividingNumbers(1, 22)) {
            System.out.println(num);
        }
    }

    private boolean isSelfDividingNumber(int c) {
        int num = c;
        int currentDigit;
        if (c == 0) {
            return false;
        }

        while (num > 0) {
            currentDigit = num % 10;
            //System.out.println("original number: " + num + " currentDigit: " + currentDigit);
            if ((currentDigit == 0) || (c % currentDigit != 0)) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}