public class SolutionTester{

	public static void main(String[] args){

		Solution test = new Solution();

		String[][] testData = {{"egg","add"},{"foo","bar"},{"title","paper"}, {"abc", "bbb"}};

		for(int i = 0; i<testData.length; i++){
			System.out.print(testData[i][0] + " : " + testData[i][1] + "--> ");
			if(test.isIsomorphic(testData[i][0],testData[i][1])){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
	}
}