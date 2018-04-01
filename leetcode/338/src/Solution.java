import java.util.stream.IntStream;

class Solution {
    public int[] countBits(int num) {
      return IntStream.rangeClosed(0,num).boxed().mapToInt(Integer::bitCount).toArray();
    }
    
    /*public static void main(String[] args) {
    	Solution sol = new Solution();
    	int num = 10;
    	int[] result = sol.countBits(num);
    	for (int val : result) {
    		System.out.println(val);
    	}
    }*/
}
