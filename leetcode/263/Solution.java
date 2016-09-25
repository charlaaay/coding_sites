public class Solution {
    public boolean isUgly(int num) {
        
        if (num <= 0) {
            return false;
        }
        /*A composite number is composed of 2 or more prime numbers,
        so divide by the "ugly numbers" */
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        if (num == 1) {
            return true;
        }
        return false;
    }
        
}
