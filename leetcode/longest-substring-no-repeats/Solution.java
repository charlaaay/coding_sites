/*
Given a string, find the length of the longest substring 
without repeating characters. For example, 
the longest substring without repeating letters for "abcabcbb" is "abc", 
which the length is 3. 
For "bbbbb" the longest substring is "b", with the length of 1.


Algorithm: Add elements to a linked list, if there is a duplicate,
count the cahce the currentsize of the list if it's the max.


*/


import java.util.LinkedList;
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        
        LinkedList<Character> list = new LinkedList<Character>();
        int maxStreak = 0;
        int index = 0;
        for(int i = 0; i<s.length(); i++){


        	
            index = list.indexOf(s.charAt(i));
            //DUPLICATE
        	if(index != -1){
                int counter = 0;
                   if(maxStreak<list.size()){
                    maxStreak=list.size();
                }
                while(counter<=index){
                    list.pop();
                    counter++;
                }
             
        	}
            list.addLast(s.charAt(i));
        }
        return maxStreak > list.size() ? maxStreak : list.size();
    }
}
