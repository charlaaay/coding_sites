import java.util.stream.IntStream;

class Solution {
	//This doesn't use DP to solve the problem, but the stream function looks cool so whatever
    public int[] countBits(int num) {
      return IntStream.rangeClosed(0,num).boxed().mapToInt(n-> Integer.bitCount(n)).toArray();
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int num = 10;
    	int[] result = sol.countBits(num);
    	for (int val : result) {
    		System.out.println(val);
    	}
    }
}
