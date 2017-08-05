import java.util.ArrayList;
import java.util.HashMap;
public class Solution {
  public String[] findWords(String[] words) {
    HashMap<Character, Character> topRow = new HashMap<Character, Character>();
    HashMap<Character, Character> midRow = new HashMap<Character, Character>();
    HashMap<Character, Character> botRow = new HashMap<Character, Character>();
        
    topRow.put('Q', 'Q');
    topRow.put('W', 'W');
    topRow.put('E', 'E');
    topRow.put('R', 'R');
    topRow.put('T', 'T');
    topRow.put('Y', 'Y');
    topRow.put('U', 'U');
    topRow.put('I', 'I');
    topRow.put('O', 'O');
    topRow.put('P', 'P');

    midRow.put('A', 'A');
    midRow.put('S', 'S');
    midRow.put('D', 'D');
    midRow.put('F', 'F');
    midRow.put('G', 'G');
    midRow.put('H', 'H');
    midRow.put('J', 'J');
    midRow.put('K', 'K');
    midRow.put('L', 'L');
        
    botRow.put('Z', 'Z');
    botRow.put('X', 'X');
    botRow.put('C', 'C');
    botRow.put('V', 'V');
    botRow.put('B', 'B');
    botRow.put('N', 'N');
    botRow.put('M', 'M');

    int row = -1;
    boolean shouldAdd;
    char c;
    ArrayList<String> returnValues = new ArrayList<String>();
    for (int i = 0; i< words.length; i++) {
      shouldAdd = true;
      row = -1;
      for (int j = 0; j < words[i].length(); j++) {
        c = words[i].charAt(j);
        c = Character.toUpperCase(c);
        if (topRow.containsKey(c)) {
          if (row != -1 && row != 1) {
            shouldAdd = false;
            break;
          }
          row = 1;
        }
        if (midRow.containsKey(c)) {
          if (row != -1 && row != 2) {
            shouldAdd = false;
            break;
          }
          row = 2;
        }
        if (botRow.containsKey(c)) {
          if (row != -1 && row != 3) {
            shouldAdd = false;
            break;
          }
          row = 3;
        }
      }
      //made it through the gauntlet
      if (shouldAdd) {
        returnValues.add(words[i]);
      }
    }
    String[] returnMe = returnValues.toArray(new String[returnValues.size()]);  
    return returnMe;
  }
}

