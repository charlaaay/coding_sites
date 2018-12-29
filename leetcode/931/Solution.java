class Solution {
    public int minFallingPathSum(int[][] A) {
        if (A.length ==0) {
            return 0;
        }
        
        int[][] holder = new int[A.length][A[0].length];
        int rowMin = Integer.MAX_VALUE;
        for (int i = 0; i < holder.length; i++) {
            rowMin = Integer.MAX_VALUE;
            for (int j = 0; j < holder[0].length; j++) {
                int cost = A[i][j];
                if (i == 0) {
                    //first row's cost doesn't have any previous values to consider.
                    holder[i][j] = cost;
                } else {
                    int optionA = Integer.MAX_VALUE;
                    int optionB = Integer.MAX_VALUE;
                    int optionC = Integer.MAX_VALUE;
                    if ((j-1 >= 0)) {
                        optionA = holder[i-1][j-1];
                    }
                    if ((j+1 < holder[0].length)) {
                        optionB = holder[i-1][j+1];
                    }
                    optionC = holder[i-1][j];
                    cost = Math.min(Math.min(optionA, optionB),optionC) + cost;
                }
                holder[i][j] = cost;
                if (cost < rowMin) {
                    rowMin = cost;
                }
            }
        }
        return rowMin;
    }
}
