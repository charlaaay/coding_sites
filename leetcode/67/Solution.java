public class Solution {
    public String addBinary(String a, String b) {
        
        int size = a.length() > b.length() ? a.length() : b.length();
        String binary = "";
        
        int carry, aVal, bVal, result;
        carry = aVal = bVal = result = 0;
        
        for (int i = 0; i < size; i++) {
            
            if (i >= a.length()) { aVal = 0; }
            else { aVal = Character.getNumericValue(a.charAt(a.length()-1-i)); }
            if (i >= b.length()) { bVal = 0; }
            else { bVal = Character.getNumericValue(b.charAt(b.length()-1-i)); }
            result = aVal + bVal + carry;
            if (result == 3) {
                carry = 1;
                binary = "1" + binary;
            } else if (result == 2) {
                carry = 1;
                binary = "0" + binary;
            } else if (result == 1) {
                carry = 0;
                binary = "1" + binary;
            } else {
                carry = 0;
                binary = "0" + binary;
            }
        }
        if (carry == 1) {
            binary = "1" + binary;
        } else {
            binary = "0" + binary;
        }
        int i = 0;
        while (i < binary.length()-1 && binary.charAt(i) == '0') {
            //trim the 0's from the front if necessary, except for the case where it is only a zero
            i++;
        }
        return binary.substring(i);
    }
}
