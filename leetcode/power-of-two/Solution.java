
public class Solution {
    public boolean isPowerOfTwo(int n) {

    	String result = Integer.toBinaryString(n);

    	if(n<0 || result.charAt(0) != '1'){
			return false;
		}
    	for(int i = 1; i< result.length(); i++){
    		if(result.charAt(i) != '0'){
    			return false;
    		}
    	}
    	return true;
    }

}