class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        
        int[][] holder = new int[s2.length()+1][s1.length()+1];
        int a,b;
        //This is the starting min value. initialize it to something very large
        int minValue = 1000;
        holder[holder.length -1][holder[0].length -1] = 0;
        for (int i = holder.length-1; i >= 0; i--) {
          for (int j = holder[i].length-1; j >= 0; j--) {
            System.out.println("Starting with values (i,j) = " + i + ", " + j);
            if ((i == holder.length - 1) && (j == holder[i].length -1)) {
              //this value has already been initialized
              System.out.println("Min value for " + i + "," + j + " is " + holder[i][j]);
              System.out.println("skipping base case");
              continue;  
            }

            minValue = 1000;
            //I'm picturing this as an box of dimension |x|*|y|. At each index, check your bottom neighbor, right neighbor
            //and bottom right neighbor. Pick the minimum after considerating delete/skip
         
            //let this represent your bottom neighbor. to get here, you would need to delete the character
            //have to stop the index early because the limiting factor is s2.charAt(j+1)
            //that is why we are doing length-1 and not just length
            if (i+1 < holder.length) {
              System.out.println("ENTERED CASE 1");
              if (holder[i+1][j] + s2.charAt(i) < minValue) {
                System.out.println("CASE 1");
                minValue = holder[i+1][j] + s2.charAt(i);
              }
            }
            //let this represent your right neighbor. to get here, you would need to delete a character
            //have to stop the index early because the limiting factor is s1.charAt(j+1)
            //that is why we are doing length-1 and not just length
            if (j+1 < holder[i].length) {
              System.out.println("ENTERED CASE 2");
              System.out.println("MinVal: " + minValue + " versus " + holder[i][j+1] + " and " + s1.charAt(j));
              System.out.println("and i and j are " + i + " " + j);
              if(holder[i][j+1] + s1.charAt(j) < minValue) {
                System.out.println("CASE 2");
                minValue = holder[i][j+1] + s1.charAt(j);
              }
            }
            if ((j+1 < holder[i].length-1) && (i+1 < holder.length-1)) {
              System.out.println("ENTERED CASE 3");
              int possibleMin = holder[i+1][j+1];
              char c = s2.charAt(i);
              char d  = s1.charAt(j);
              if (c != d) {
                //if the characters aren't the same, then we need to add a cost since we're deleting both of them
                possibleMin += c + d;
              }
              if (possibleMin < minValue) {
                System.out.println("CASE 3");
                minValue = possibleMin;
              }
            }
            System.out.println("Min value for " + i + "," + j + " is " + minValue);
            holder[i][j] = minValue;
          }
        }
      return holder[0][0];
    }

    public static void main(String[] args) {

      Solution sol = new Solution();
      System.out.println(sol.minimumDeleteSum("food", "dog"));      
    }
}
