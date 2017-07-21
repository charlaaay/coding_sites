public class Main {

  public static void main (String[] args) {

    Solution sol = new Solution();
    
    int [] xValues = {4,0, 265, 32, 32};
    int [] yValues = {1,0, 265, 31, 32};
    int [] expectedValues = {2,0, 0, 6, 0};
    int result;
    for (int i = 0; i < xValues.length; i++) {
      result = sol.hammingDistance(xValues[i],yValues[i]);
      if (result != expectedValues[i]) {
        System.out.println("Wrong value for " + xValues[i] + ", " + yValues[i]);
      }
    }
  }

}

