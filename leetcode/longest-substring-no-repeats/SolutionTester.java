import java.util.LinkedList;
public class SolutionTester {

	public static void main(String[] args){


		Solution test = new Solution();
		System.out.print("14 = ");
		System.out.println(test.lengthOfLongestSubstring("abcdefgabcdefghijklmn"));

		System.out.print("3 = ");
		System.out.println(test.lengthOfLongestSubstring("abcabcbb"));

		System.out.print("3 = ");
		System.out.println(test.lengthOfLongestSubstring("dvdf"));
		

	}
}