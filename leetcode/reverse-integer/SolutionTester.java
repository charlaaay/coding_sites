
import java.lang. Math;

public class SolutionTester{


	

	public static void main(String[] args){

		//System.out.println(Integer.MAX_VALUE);
		int test = 1534236469;
		setup(test);

		/*for(int i = 0; i<15; i++){
			if(Math.random()>.5){
				setup((int)(Math.random()*10000));
			}
			else{
				setup((int)(Math.random()*-10000));
			}
		}*/

		
	}

	public static void setup(int input){

		Solution test = new Solution();
		int input2 = test.reverse(input);
		System.out.println(input + " : " + input2);
	}

}