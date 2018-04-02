import java.util.stream.IntStream;
class Solution {
    public int numSquares(int n) {
    	
    	int[] perfectSquares = IntStream.rangeClosed(1, (int) Math.sqrt(n)).map(num -> num*num).toArray();
    	int[] mins = new int[n+1];
    	
    	int perfectSquare;
    	for (int i = 1; i <= n; i++) {
    		for (int j = 0; (j < perfectSquares.length) && (perfectSquares[j] <= i); j++) {
    			System.out.println("Checking perfect square " + perfectSquares[j] + " when i = " + i);
    			perfectSquare = perfectSquares[j];
    			if (j > 0) {
    				mins[i] = Math.min(mins[i], mins[i-perfectSquare] + 1);
    			} else {
    				mins[i] = mins[i-perfectSquare] + 1;
    			}
    		}
    		System.out.println("The max value when n = " + i + " is " + mins[i]);
    	}
        return mins[n];
    }
    
    public static void main(String[] args) {
    	
    	Solution sol = new Solution();
    	System.out.println(sol.numSquares(2));
    }
}