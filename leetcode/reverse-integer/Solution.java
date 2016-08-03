public class Solution {

    public int reverse(int x) {

        int result = 0;
        int temp = 0;
        int length = x< 0 ? String.valueOf(x).length()-1 : String.valueOf(x).length();
       	

        for(int i = 0; i<length;i++){
        	temp = x %10;
        	//reversible numbers could be longer than int size, if so, return 0
        	if((long)result*10 > Integer.MAX_VALUE 
        		|| (long)result*10 < Integer.MIN_VALUE){
        			return 0;
        	}
        	result *=10;
        	result += temp;
        	x /= 10;
        	
        	

        }
        return result;
    }
}