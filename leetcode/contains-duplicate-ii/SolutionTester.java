import java.util.HashMap;
public class SolutionTester{

	public static void main(String[] args){


		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

		
		Solution solution = new Solution();

		int[] nums = {-1,-1};
		boolean result = solution.containsNearbyDuplicate(nums, 1);

		System.out.println(result == true ? "True" : "False");
	}

}