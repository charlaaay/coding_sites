import java.util.ArrayList;
import java.util.ListIterator;

public class SolutionTester {

  public static void main(String[] args) {
    Solution sol = new Solution();
    ArrayList<String> testCases = new ArrayList<String>();
    testCases.add("bracedarracecarr");
    testCases.add("racecar");
    testCases.add("dolphin");
    testCases.add("bible");
    testCases.add("instruurts");
    testCases.add("tattle");
    testCases.add("four");
    testCases.add("foor");
    testCases.add("foof");
    testCases.add("bb");
    testCases.add("r");
    ListIterator<String> it = testCases.listIterator();
    while (it.hasNext()) {
      String testCase =  it.next();
      System.out.println("testing " + testCase);
      String longest = sol.longestPalindrome(testCase);
      System.out.println("answer " + longest);
      System.out.println();
    }
  }

}
