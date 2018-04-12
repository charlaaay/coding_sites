import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> answers = new HashSet<>();
        String[] morseCodeWords = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        int index;
        String morseCodeWord;
        for (String s : words) {
            morseCodeWord = "";
            for (int i = 0; i < s.length(); i++) {
                index = (int)s.charAt(i) - 97;
                morseCodeWord = morseCodeWord + morseCodeWords[index];
            }
            if (morseCodeWord != "") {
                answers.add(morseCodeWord);
            }
        }
        return answers.size();
    }
}
