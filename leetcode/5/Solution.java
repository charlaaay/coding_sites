class Solution {
    public String longestPalindrome(String s) {
        String longestSubstring = "";
        for(int i = 0; i<s.length();i++) {
            int matches = getLongestPalindromeLength(s, i, i);
            //System.out.println("found matches " + matches);
            String substring = s.substring(i - (matches -1), i + matches);
            if (substring.length() > longestSubstring.length()) {
                longestSubstring = substring;
            }
        }

        for(int i = 0; i<s.length()-1;i++) {
            int matches = getLongestPalindromeLength(s, i, i+1);
            //System.out.println("found matches " + matches);
            if (matches == 0) {
                continue;
            }
            String substring = s.substring(i-(matches-1),  (i+1)+ (matches-1) +1);
            if (substring.length() > longestSubstring.length()) {
                longestSubstring = substring;
            }
        }
        return longestSubstring;
    }

    //start & end index are inclusive
    private int getLongestPalindromeLength(String s, int startIndex, int endIndex) {
        int matches = 0;
        while (startIndex >= 0 && endIndex <= s.length() - 1) {
            if (s.charAt(startIndex) != s.charAt(endIndex)) {
                break;
            }
            startIndex--;
            endIndex++;
            matches++;
        }
        return matches;
    }
}
