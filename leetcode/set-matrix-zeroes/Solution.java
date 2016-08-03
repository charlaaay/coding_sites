public class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean [][] isDirty = new boolean[matrix.length][matrix[0].length];
	  for (int i = 0; i<isDirty.length; i++) {
	       for(int j = 0; j<isDirty[i].length;j++) {
		    isDirty[i][j] = false;
	       }
	  } 
        for(int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
		    isDirty[i][j] = true;                    
                }
            }
        }
	  for (int i = 0; i<matrix.length; i++) {
	       for(int j = 0; j<matrix[i].length; j++) {
		    if(isDirty[i][j]) {
			 setRowToZero(matrix, i);
			 setColumnToZero(matrix, j);
		    }
	       }
	  }
    }
    
     private static void setRowToZero(int[][] matrix, int row) {
	  
	  for (int i = 0; i<matrix[row].length; i++) {
	       matrix[row][i] = 0;	       
	  }    
    }
     private static void setColumnToZero(int[][] matrix, int column) {
	  
	  for (int i = 0; i<matrix.length; i++) {
	       matrix[i][column] = 0;	       
	  }    
    }    
}
