import java.util.HashSet;
public class Solution {
    HashSet<Integer> hashSet = new HashSet<Integer>();
    public boolean isPowerOfThree(int n) {
        
        if(n == 1) {
            return true;
        }
        if(!(n%3 == 0)) {
            return false;
        }
        
       return this.doWork((double)n);
    }
    
    public static boolean doWork(double n) {
        
        if(n == 1) {
            return true;
        } else if(n<1) {
            return false;
        } 
        return doWork(n/3);
    }
}
