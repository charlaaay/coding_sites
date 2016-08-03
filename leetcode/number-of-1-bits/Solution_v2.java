//This solution works because the shift operator
//can still handle a number of 32 bits, my other
//solution was 1 number too short
public class Solution_v2
{

	public int hammingWeight(int n) {

		int count = 0;
		long num = 1;
		for(int i = 1; i<=32; i++){
			
			System.out.println("i is " + num);
			if((num & n) != 0){
				count++;
			}
			num = num<<1;
		}
		return count;
	}

}