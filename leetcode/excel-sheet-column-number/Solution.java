	public class Solution {
		
		char[] alphabet = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	   
		public int titleToNumber(String s) {
	    
	        int n = 1;
	        int result = 0;
	        
	        for(int i = s.length()-1; i>=0; i--) {
	            
	        	int num = new String(alphabet).indexOf(s.charAt(i));
	            result +=  n*num;
	            n = 26*n;
	        }
	    return result;
	    }
		public static void main(String[] args){
			
			Solution sol = new Solution();
			String[] dataset = {"ABC"};
			int result = 0;
			for(int i = 0; i<dataset.length;i++){
				result = sol.titleToNumber(dataset[i]);
				System.out.println(result);
			}
		}
	}


