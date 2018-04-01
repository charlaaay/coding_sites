/**
 * @author charlie2ez
 *
 */
public class Solution {

	public int integerBreak(int n) {
		
		if (n <= 3) {
			//this is necessary because of the assumption made on line 18
			return n-1;
		}
		
		int[] maxProds = new int[n+1];
		int num1, num2, num1Prod, num2Prod, currentValue;
		for (int i = 0; i<= n; i++) {
			//the max prod will atleast be the number. This holds true for n >= 4
			maxProds[i] = i;
			//System.out.println("Starting to compute n = " + i);
			for (int j = 1; j<=i/2; j++) {
				num1 = j;
				num2 = i-j;
				//System.out.println("Starting to compute combo (" + num1 + "," + num2 + ")");
				num1Prod = maxProds[num1];
				num2Prod = maxProds[num2];
				//It's not guaranteed that the product of the sum of a number will be greater
				//than the number itself, so we must check both values. Specifically, n = {2,3}
				//won't have a product greater than the number itself
				currentValue = Math.max(num1 * num2, num1Prod * num2Prod);
				maxProds[i] = Math.max(currentValue, maxProds[i]);
			}
			//System.out.println("i[" + i +"] -> " + maxProds[i]);
		}
		return maxProds[n];
    }
	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.integerBreak(30));
	}
}
