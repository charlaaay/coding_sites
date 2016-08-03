//if the number is 0000000011 -> decimal 3..
//number of 1's = 2, so return 2

//This function works well for ints, but doesn't handle
//unsigned ints, which is a requirement
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
		int lower = lowerRange(n);
		int i = 0;
		while(n>0){
			//System.out.println("n:" + n);
			if(n>=lower){
				n -= lower;
				i++; 
			}
			lower/=2;
		}       

        return i;

    }
    
    private static int lowerRange(int n){

    	int number =(int)(Math.log10(n)/Math.log10(2));
   		int result = 1;
   		int i = 0;
   		while(i<number){
   			result = result*2;
   			i++;
   		}
   		return result;
    }
}