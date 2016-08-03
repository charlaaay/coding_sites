//This method could be improved by doing binary search 
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0 || strs[0].length() == 0){
        	return "";
        }

        int shortestLength = strs[0].length();
        for(int i = 0; i<strs.length;i++){
        	if(shortestLength> strs[i].length()){
        		shortestLength = strs[i].length();
        	}
        }
        int maxPrefix = 0;
        for(int i = 0; i<shortestLength; i++){

        	char currentLetter = strs[0].charAt(i);
        	for(int j = 0;j<strs.length; j++){
        		if(currentLetter != strs[j].charAt(i)){
        			return strs[0].substring(0,maxPrefix);
        		}
        	}
        	maxPrefix++;
        }
        
        return strs[0].substring(0,maxPrefix);
    }
}
