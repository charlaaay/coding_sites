import java.util.ArrayList;
public class Solution {
    private int[] originalArray;
    public Solution(int[] nums) {
        originalArray = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return originalArray;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] returnMe = new int[originalArray.length];
        ArrayList<Integer> available = new ArrayList<Integer>();
        for (int i = 0; i < originalArray.length; i++) {
            available.add(i);    
        }
        for (int i = 0; i< originalArray.length; i++) {
            int randomNumber = (int)(Math.random() * available.size());
            int randomIndex = available.get(randomNumber);
            returnMe[randomIndex] = originalArray[i];
            available.remove(randomNumber);
        }
        return returnMe;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
