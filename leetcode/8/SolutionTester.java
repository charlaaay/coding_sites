public class SolutionTester {

  public static void main(String[] args) {

    Solution sol = new Solution();
    String[] testStrings = {
      "-432349",
      "-----",
      "      -5969",
      "+44444",
      "33333333333333333333333333",
      "42",
      "-42",
      " - 42",
      "+42",
      "4193 with words",
      "words and 987",
      "-91283472332",
      "2147483648",
      "-6147483648",
      "  0000000000012345678",
      "20000000000000000000",
      "2147483646"
    };

    int[] expectedOutput = {
      -432349,
      0,
      -5969,
      44444,
      Integer.MAX_VALUE,
      42,
      -42,
      0,
      42,
      4193,
      0,
      Integer.MIN_VALUE,
      Integer.MAX_VALUE,
      Integer.MIN_VALUE,
      12345678,
      Integer.MAX_VALUE,
      2147483646
    };


    for (int i = 0; i < testStrings.length; i++) {
      int output = sol.myAtoi(testStrings[i]);
      if (output != expectedOutput[i]) {
        String s = String.format("Wrong ouput. Expected %d but found %d. Input was %s", expectedOutput[i], output, testStrings[i]);
        System.out.println(s);
      } else {
        String s = String.format("PASSED for input %s", testStrings[i]);
        System.out.println(s);
      }
    }
  }
}
