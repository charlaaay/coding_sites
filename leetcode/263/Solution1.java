public class Solution {
//This was the first implementation. It used too much memory
    public boolean isUgly(int num) {
        
        if (num <= 0) {
            return false;
        }
        if (num == 1 || num == 4) {
            return true;
        } else if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
            //no point in continuing
            return false;
        }
        // [0...num];
        System.out.println("before allocation");
        boolean[]isComposite = new boolean[num+1];
        System.out.println("after allocation");
        
        //using sieve of eratosthenes 
        for (int i = 2; i<= Math.sqrt(num); i++) {
            if (isComposite[i]) {
                continue;
            }
            for (int j = 2; j*i <= num; j++) {
                //System.out.println("marking " + j*i + " as composite");
                isComposite[j*i] = true;
            }
        }
        for (int i = 2; i<= num; i++) {
            if (i == 2 || i == 3 || i == 5) {
                continue;
            }
            if (!isComposite[i]) {
                //System.out.println("prime: " + i);
            }
            if (!isComposite[i] && num % i == 0) {
                    return false;
            }        
        }
        return true;
    }
}
