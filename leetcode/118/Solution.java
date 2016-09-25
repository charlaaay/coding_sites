import java.util.ArrayList;
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listHolder = new ArrayList<List<Integer>>();
        
        int num1, num2;
        num1 = num2 = 0;
        for (int i = 0; i< numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            List<Integer> previousRow = new ArrayList<Integer>();
            if (i != 0) {
                previousRow = listHolder.get(i-1);
            }
            for (int j = 0; j<=i; j++) {
                if (i == 0) {
                    list.add(1);    
                } else {
                    if (j == 0 || j == i) {
                        list.add(1);
                    } else {
                        num1 = previousRow.get(j-1);
                        num2 = previousRow.get(j);
                        list.add(num1 + num2);
                    }
                }
            }
            listHolder.add(list);
        }
        return listHolder;
    }
}
