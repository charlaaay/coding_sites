import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int myAtoi(String str) {
        
        //if string is empty, return
        if (str.length() == 0) {
            return 0;
        }
        
        //regex the valid characters
        Pattern p = Pattern.compile("(?:^)([+-]?\\d+)");
        Matcher m = p.matcher(str.trim());
        
        int sum = 0;
        boolean hasOverflow = false;
        if (m.find()) {
          sum = 0;
          int multiplier = 1;
          String s = m.group();
          int j = 0;
          for (int i = s.length() - 1; i >=0; i--) {
            if (s.charAt(i) == 43 || s.charAt(i) == 45) {
              //plus or minus sign in ascii
              continue;
            }
            //ascii offset
            int value = (int) s.charAt(i) - 48;
            int addon  = value * multiplier;
            if (sum + addon < sum) {
              //System.out.println("overflow detected");
              hasOverflow = true;
              break;
            }
            if (value > 2 && multiplier >= 1000000000) {
              hasOverflow = true;
              break;
            }
            if (j >=10  && value != 0)  {
              //System.out.println("hasOverflow");
              hasOverflow = true;
              break;
            }
            j++;
            //System.out.println(String.format("adding %d to the sum of %d to produce new sum of %d. Value is %d", addon, sum, addon + sum, value));
            sum += addon;
            multiplier *= 10;
          }
            if (s.charAt(0) == 45) {
              sum *= -1;
                if (hasOverflow) {
                  sum = Integer.MIN_VALUE;
                } 
            } else if (hasOverflow) {
              sum = Integer.MAX_VALUE;
            }
        }

        return sum;
    }
}
