public class Solution_v1{

	public int hammingWeight(int n) {
		int count = 0;
	 	for(long i = 1; i<=n; i*=2){
	 		System.out.println("i is now " + i);
	 		if((i & n) != 0){
	 			count++;
	 		}
	 	}
	 	return count;
	}
}

