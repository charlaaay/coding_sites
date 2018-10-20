/**
In this example, we're doing a dynamic programming problem where we have the following recurrence

DElETE: 1 + (X[i...n], Y[j+1...m]
REPLACE: 1 + (X[i+1...n], Y[j+1...m]
MATCHES: 0 + (X[i+1...n], Y[j+1...m]
INSERT: 1 + (X[i+1...n], Y[j...m]

It is solved using bottom up DP and the table of size |i|*|j| is filled from bottom right corner to the top left corner.
*/
class Solution {
    public int minDistance(String word1, String word2) {
        //initialize the min value to something very large
        int minValue;
        //For these types of problems we add an extra row & column
        //we assume we need to completely remove the word. so kind of like
        //our string is " word1" and " word2"
        int[][] holder = new int[word1.length()+1][word2.length()+1];
        int cost;
        for (int i = holder.length-1; i >= 0; i--) {
            for (int j = holder[i].length-1; j >= 0; j--) {
                
                if (i == holder.length -1 && j == holder[i].length -1 ) {
                    //This is the very bottom right box. It starts at a cost of 0
                    //because no operations have been performed yet.
                    holder[i][j] = 0;
                    continue;
                }
                minValue = Integer.MAX_VALUE;
                if (j+1 < holder[i].length) {
                    //if j has a neighbor to the right
                    if (minValue > 1 + holder[i][j+1]) {
                        minValue = 1 + holder[i][j+1];
                    }
                    
                }
                if (i+1 < holder.length) {
                    //if i has a neighbor to the bottom
                    if (minValue > 1 + holder[i+1][j]) {
                        minValue = 1 + holder[i+1][j];
                    }
                }
                if (i+1 < holder.length && j+1 < holder[i].length) {
                    //if j has a neighbor to the bottom & right (aka diagonally)
                    cost = 1;
                    if (word1.charAt(i) == word2.charAt(j)) {
                        // if the two characters are equal, then we don't need to modify them and therefore this move is free.
                        cost = 0;
                    }
                    if (minValue > cost + holder[i+1][j+1]) {
                        minValue = cost + holder[i+1][j+1];
                    }
                }
                holder[i][j] = minValue;
            }
        }
        return holder[0][0];
    }
}
