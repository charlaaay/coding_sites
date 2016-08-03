public class SolutionTester{

	public static void main(String[] args){

		Solution test = new Solution();

		String[][] testSet = {{"abc", "def"},{"a","b"}, {"abcdef","abrrrrrrrrrrrrrrrrr"},{"cwtrqug"}};

		for(int i =0; i<testSet.length;i++){
			System.out.println(test.longestCommonPrefix(testSet[i]));
		}
	}

}