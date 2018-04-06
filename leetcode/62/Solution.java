class Solution {
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <=0) {
            return 0;
        }    
        int[][] counts = new int[m][n];
            
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (j == 0 || i == 0) {
                    //on the edge. only one way to go
                    counts[i][j] = 1;
                } else {
                    //not on the edge. can come from above or left
                    counts[i][j] = counts[i-1][j] + counts[i][j-1];
                }
            }
        }
        return counts[m-1][n-1];
    }
}
