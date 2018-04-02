import java.util.HashSet;
class Solution {
    public int countSubstrings(String s) {
    	int counter = 0;
    	for (int i = 0; i < s.length(); i++) {
    		
    		counter+= countPalindromes(s, i, i);
    		counter+= countPalindromes(s, i, i+1);
    		
    	}
    	return counter;
    }

    public int countPalindromes(String s, int start, int end)
    {
    	int counter = 0;
    	while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			//System.out.println("Checking j = " + start + " and k = " + end);
			counter++;
			start--; end++;
		}
    	return counter;
    }
    
    /*
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	System.out.println(sol.countSubstrings("abc"));
    }
    */
    
}