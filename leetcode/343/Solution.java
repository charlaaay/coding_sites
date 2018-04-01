/**
 * 
 */

/**
 * @author charlie2ez
 *
 */
public class Solution {

	public int integerBreak(int n) {
		
		//at each index, find all the combinations that sum up to N,
		//and the max product is whichever combination yields the highest
		//prod. You can memorize the indexes
		int[] maxProds = new int[n+1];
		int num1, num2, num1Prod, num2Prod, currentValue;
		for (int i = 0; i<= n; i++) {
			maxProds[i] = i;
			//System.out.println("Starting to compute n = " + i);
			for (int j = 1; j<=i/2; j++) {
				num1 = j;
				num2 = i-j;
				//System.out.println("Starting to compute combo (" + num1 + "," + num2 + ")");
				num1Prod = maxProds[num1];
				num2Prod = maxProds[num2];
				currentValue = Math.max(num1 * num2, num1Prod * num2Prod);
				maxProds[i] = Math.max(currentValue, maxProds[i]);
			}
			//System.out.println("i[" + i +"] -> " + maxProds[i]);
		}
		return maxProds[n];
    }
	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.integerBreak(2));
	}

}
