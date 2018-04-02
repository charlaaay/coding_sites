import java.util.HashSet;
class Solution {
	HashSet<String> answers = new HashSet<String>();
    public int countSubstrings(String s) {
    	int counter = 0;
    	for (int i = 0; i < s.length(); i++) {
    		counter+= countPalindromes(s, i, s.length());
    	}
    	System.out.println("size of hash is " + answers.size());
    	return counter;
    }
    
    
    public int countPalindromes(String s, int startIndex, int endIndex) {
    	
    	if (s.length() == 0 || checkSet(startIndex, endIndex)) {
    		System.out.println("Bailing early for the string " + s.substring(startIndex, endIndex));
    		//we've already seen this recursion before. don't double count
    		return 0;
    	}
    	System.out.println("Checking the string " + s.substring(startIndex, endIndex));
    	int counter = 0;
    	if (s.substring(startIndex, endIndex).length() == 1) {
    		addToSet(startIndex, endIndex);
    		counter++;
    	} else {
    		if (isPalindrome(s.substring(startIndex, endIndex))) {
    			addToSet(startIndex, endIndex);
    			counter++;
    		}
    		counter += countPalindromes(s, startIndex, startIndex+1) + countPalindromes(s, startIndex+1, s.length());
    		counter += countPalindromes(s, startIndex, s.length()-1) + countPalindromes(s, s.length()-1, s.length());
    		System.out.println("about to call countPalindromes for string " + s.substring(startIndex+1, s.length()));
    		System.out.println("which has the indices " + (startIndex+1) + ", " + s.length());
    	}
    	
    	return counter;
    }
    
    private void addToSet(int startIndex, int endIndex) {
    	String hash = Integer.toString(startIndex) + "," + Integer.toString(endIndex);
    	System.out.println("Adding the string " + hash + " to the index");
    	answers.add(hash);
    }
    private boolean checkSet(int startIndex, int endIndex) {
    	String hash = Integer.toString(startIndex) + "," + Integer.toString(endIndex);
    	return answers.contains(hash);
    }
    
    public boolean isPalindrome(String s) {
    	for (int i = 0, j = s.length()-1; i < j; i++, j--) {
    		if (s.charAt(i) != s.charAt(j)) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	System.out.println(sol.countSubstrings("aaa"));
    }
}