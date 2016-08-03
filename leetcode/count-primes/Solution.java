//Counts the number of primes less than a non-negative number
//This is a working algorithm, but it was too slow for codeleet-> working to revise
//Added Math.sqrt(n-1) to reduce iterations. This method is called 'sieve of erasothenes' (spelling 2 strong)
public class Solution {
    public int countPrimes(int n) {
        boolean[] array = new boolean[n];
        
        for(int i = 0;i<array.length; i++){
        	array[i]  = true;
        }
        for(int i= 2; i<Math.sqrt(n); i = (i%2 == 0)? i+1 : i+2){
        	//System.out.println("i = " + i);
            if(array[i]){
                for(int j = 2*i; j<n; j+=i){
                	
                    	array[j] = false;
                  
                }
            }
        }
        
        int count = 0;
        for(int i = 2; i< n; i++){
            if(array[i]){
                count++;
            }
        }
        return count;
    	//return -1;
    }

}