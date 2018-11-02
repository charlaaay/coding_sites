/**

Given a number, say 16, you want to find the largest number that is 16 is divisible by (which in this case is 8.)
It takes 1 paste operation to go from 8 to 16. now you want to repeat the process for 8

*/
class Solution {
    public int minSteps(int n) {
        
        if (n == 0 || n == 1) {
            //no operations required
            return 0;
        }
        int startingNumber = n/2;
        while (n % startingNumber != 0) {
            startingNumber--;
        }
        int stepsTaken = n / startingNumber;
        return (stepsTaken + minSteps(startingNumber));
    }
}
