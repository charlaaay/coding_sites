public class Solution {
    public int addDigits(int num) {
        do {
            num = doWork(num);
        } while (num>9);
        return num;
    }
 
    private static int doWork(int num) {
        int sum = 0;
        while(num>0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
