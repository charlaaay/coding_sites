public class Solution {
  public static final long CEILING = 2147483648L;
  public int hammingDistance(int x, int y) {

    if (x == 0 && y == 0 ) {
      return 0;
    }
    if (x < 0 || y < 0) {

      return 0;
    }

    int maxNum = x > y ? x : y;
    long powOf2 = CEILING;

    while (powOf2 > maxNum && powOf2 > 1) {
      powOf2 /= 2;
    }
    
    int count = 0;
    boolean xIsDiv, yIsDiv;
    while (powOf2 > 0) {
      xIsDiv = false;
      yIsDiv = false;
      if (powOf2 <= x) {
        xIsDiv = true;
        x -= powOf2;
      }
      if (powOf2 <= y) {
        yIsDiv = true;
        y -= powOf2;
      }
      if (yIsDiv != xIsDiv) {
        count++;
      }
    powOf2 /= 2;
    }
    return count;
  }
}
