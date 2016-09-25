public class Solution {
    public int[] plusOne(int[] digits) {
        int sum, carryOver;
        sum = 0;
        carryOver = 1;
        for (int i = digits.length -1; i >= 0; i--) {
            if (carryOver == 0) {
                break;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                carryOver = 0;
                digits[i]++;
            }
        }
        
        if (carryOver == 1) {
            /*
            If we get to the end of the loop and there is a carryOver,
            this means that we need expand the array and prepend a "1"
            */
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            for (int i = 1; i<newDigits.length; i++) {
                newDigits[i] = digits[i-1];
            }
            return newDigits;
        }
        return digits;
    }
}
