/*seems like this could be a good place for an iterator */
public class Solution {
    public int compareVersion(String version1, String version2) {
        
        boolean isDone = false;
        int firstIndex = 0;
        int secondIndex = 0;
        Object[] result = new Object[2];
        
    
        int v1;
        int v2;
        do {
        
            result = this.findVersion(version1, firstIndex);
            firstIndex = (int)result[1];
            v1 = Integer.parseInt(result[0].toString());
            
            result = this.findVersion(version2, secondIndex);
            secondIndex = (int)result[1];
            v2 = Integer.parseInt(result[0].toString());
            
            if (v1 > v2) {
                return 1;
            } else if (v2 > v1) {
                return -1;
            }
            
            if (secondIndex == version2.length() && firstIndex == version1.length()) {
                return 0;
            }
            
            
        } while(!isDone);
        return 0;
    }
    
    //iterator for the strings. This parses out the numbers from the decimal points
    public Object[] findVersion(String version, int startPosition) {
        Object[] returnMe = new Object[2];
        
        if (startPosition >= version.length()) {
            //if we are at the end of the string, return -1 to denote this
            returnMe[0] = "0";
            returnMe[1] = version.length();
            return returnMe;
        }
        
        for (int i = startPosition; i< version.length(); i++) {
            if (version.charAt(i) == '.') {
                //return everything up until the decimal point
                returnMe[0] = version.substring(startPosition, i);
                //set the next start position right after the decimal point
                returnMe[1] = i+1;
                return returnMe;
            }
        }
        //There wasn't a decimal point found, so just return the whole string
        returnMe[0] = version.substring(startPosition);
        returnMe[1] = version.length();
        return returnMe;
    }
}
