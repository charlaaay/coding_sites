import java.util.HashSet;
import java.util.stream.IntStream;
public class Solution {
	    public int[] singleNumber(int[] nums) {
	    	HashSet<Integer> set = new HashSet<>();
	    	
	    	for (int n : nums) {
	    		updateMap(set, n);
	    	}
	    	return set.stream().mapToInt(i -> i).toArray();
	    }
	    
	    private void updateMap(HashSet<Integer> set, int num) {
	    	if (set.contains(num)) {
	    		set.remove(num);
	    	} else {
	    		set.add(num);
	    	}
	    }
	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int[] numbers = {1,2,3,1,2,3,4,5,6,6};
		int[] result = sol.singleNumber(numbers);
		for(int r : result) {
			System.out.println(r);
		}

	}

}
