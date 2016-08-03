import java.util.Stack;
import java.util.HashMap;
public class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character,Character> tags  = new HashMap<Character,Character>(3);
        tags.put(')','(');
        tags.put(']','[');
        tags.put('}','{');
        
        Stack<Character> stack = new Stack<Character>();
        
        if(s.length() == 0){
            return false;
        }
        
        for(int i = 0; i<s.length();i++){
            
            if(tags.containsKey(s.charAt(i))){
                
                
                if(stack.size() == 0 || tags.get(s.charAt(i)) != stack.pop()){
                    
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        
        return stack.size() == 0? true: false;
    }
}