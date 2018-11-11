import java.util.ArrayList;
import java.util.HashMap;
public class LongestCommonSubSequence {

  private static HashMap<Integer, HashMap<Integer, ArrayList<Character>>> pad = new HashMap<Integer, HashMap<Integer, ArrayList<Character>>>();
  public static void main(String[] args) {
     String s1 = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
     String s2 = "GTCGTTCGGAATGCCGTTGCTCTGTAAA";
     System.out.println("Sizes: " + s1.length() + "..." + s2.length());
     ArrayList<Character> result = LCS(s1, s2);
     System.out.println("The size is " + result.size());  
     for (int i = 0; i < result.size(); i++) {
      System.out.print(result.get(i));
     }
  }

  public static ArrayList<Character> LCS(String s1, String s2) {

    if (s1.length() == 0 || s2.length() == 0) {
      //This is the base case. If one of the strings are empty, the LCS is going to be 0
      return new ArrayList<Character>();
    }
    if (pad != null && pad.get(s1.length()) != null && pad.get(s1.length()).get(s2.length()) != null) {
      //return the cached version
      //System.out.println("Cache hit");
      return pad.get(s1.length()).get(s2.length());
    }
    //Grab the last  character from each string
    char a = s1.charAt(s1.length() -1);
    char b = s2.charAt(s2.length() -1);
    //go through the cases
    ArrayList<Character> result;
    if (a == b) {
      //this WILL be part of the LCS
      //so do the rest of the prefixes and then append your value to the end.
      ArrayList<Character> optionA = LCS(s1.substring(0, s1.length()-1), s2.substring(0, s2.length()-1)); 
      ArrayList<Character> temp = new ArrayList<Character>(optionA);
      temp.add(a);
      result = temp; 
    } else {
      //assume the last character of s1 won't appear in the LCS, so it won't hurt to remove it
      ArrayList<Character> optionB = LCS(s1.substring(0, s1.length()-1), s2.substring(0, s2.length())); 
      //assume the last character of s2 won't appear in the LCS, so it won't hurt to remove it
      ArrayList<Character> optionC = LCS(s1.substring(0, s1.length()), s2.substring(0, s2.length()-1)); 
      if (optionB.size() > optionC.size()) {
        result = optionB;
      } else {
        result = optionC;
      }
    }
    HashMap<Integer, ArrayList<Character>> firstIndex = pad.get(s1.length());
    if (firstIndex == null) {
      firstIndex = new HashMap<Integer, ArrayList<Character>>();
    }
     
    firstIndex.put(s2.length(), result);
    pad.put(s1.length(), firstIndex);
    
    return result;
  }
}
