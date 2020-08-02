class Solution {
    public String convert(String s, int numRows) {
      if (numRows == 1) {
          return s;
      }
      String[] holder = new String[numRows];
      for(int i = 0; i < holder.length; i++) {
        holder[i] = "";
      }
      int currentRow = 0;
      int direction = 1;
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        holder[currentRow] = holder[currentRow] + c;
        if ((currentRow == numRows -1) && direction == 1) {
          direction = -1;
        } else if (currentRow == 0 && direction == -1) {
          direction = 1;
        }
        currentRow += direction; 
      }
      String answer = "";
      for(int i = 0; i < holder.length; i++) {
        answer += holder[i];
      }
      return answer;
    }
}
