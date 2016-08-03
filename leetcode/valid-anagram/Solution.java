import java.util.HashMap;
public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        System.out.println("Comparing lengths: " + s.length() + " : " + t.length());
        
        HashMap<Character, Integer> sMap = new HashMap<Character,Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character,Integer>();
        
        for(int i = 0; i<s.length();i++){
            
            if(sMap.containsKey(s.charAt(i))){
                int temp = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), temp+1);
            }
            else{
                sMap.put(s.charAt(i), 0);
            }
        }
        
        //me being lazy...
        
        for(int i = 0; i<t.length();i++){
            
            if(tMap.containsKey(t.charAt(i))){
                int temp = tMap.get(t.charAt(i));
                tMap.put(t.charAt(i), temp+1);
            }
            else{
                tMap.put(t.charAt(i), 0);
            }
        }
        
        //me being lazy again, and partially not knowing how to use an iterator
        
        try{
            for(int i = 0; i<s.length();i++){
                int i1 = sMap.get(s.charAt(i));
                int i2 = tMap.get(s.charAt(i));
               if(i1 != i2){
                   System.out.println("the code broke at character '" + s.charAt(i) + "' because the occurences were not the same. They were: " + i1 + " and " + i2);
                   return false;
               }
            }
            return true;
            
        }
        catch(NullPointerException e){
            return false;
        }
    }
}