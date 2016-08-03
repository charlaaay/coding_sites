public class Solution {

    public int rangeBitwiseAnd(int m, int n) {
        
        //2^30
        final int POWER_OF_TWO = 1073741824;
        int lowerBound = POWER_OF_TWO;

        //Sanity check
        if(m>n || m<=0){
            System.out.println("caught at the first block");
            return 0;
        }
        if((m == n)){
            //save time
            return m;
        }

        //find a power of two just below the highest number
        while(lowerBound>n){
            lowerBound=lowerBound>>1;
        }
        //If not, you will run into a condition like 8&7 or 16&15 = 0
        if(m<lowerBound){
            System.out.println("caught here");
            return 0;
        }

        int result = 0;
        int range = n-m;
        System.out.println("caught at the while block");
        while(lowerBound>=range){
           
            if((m&lowerBound) != 0 && (n&lowerBound) != 0){
               
                result+= lowerBound;
                
            }
            lowerBound = lowerBound>>1;
        }
        
        return result;
        
    }

    public static void main(String[] args){
        Solution sol = new Solution();

        int test = sol.rangeBitwiseAnd(Integer.MAX_VALUE,Integer.MAX_VALUE);
        System.out.println(test);
    }

}


