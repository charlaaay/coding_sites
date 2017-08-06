public class Solution {
    public String convertToTitle(int n) {
        char[] values = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        
        String col = "";
        char letter;
        
        while (n > 0) {
            n--;
            letter = values[n%26];
            col = letter + col;
            n /= 26;
        }
        return col;
    }
}
