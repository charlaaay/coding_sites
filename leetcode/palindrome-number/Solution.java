public class Solution {

    public boolean isPalindrome(int x) {
	
	
	String lol = Integer.toString(x);
	
	int j = lol.length()-1;
	for(int i = 0; i<=j;i++){
	
		if(lol.charAt(i) != lol.charAt(j)){
		
			return false;
		}
		j--;	
	}
	return true; 
    }

}
