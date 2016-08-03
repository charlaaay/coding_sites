public class SolutionTester{


	public static void main(String[] args){

		Solution sol = new Solution();
  		System.out.println(sol.hammingWeight(67));
  		Solution_v1 test_v1 = new Solution_v1();
  		System.out.println(test_v1.hammingWeight(2147483647));


  		Solution_v2 test_v2 = new Solution_v2();
  		System.out.println(test_v2.hammingWeight(2147483647));
  		 

	}
} 