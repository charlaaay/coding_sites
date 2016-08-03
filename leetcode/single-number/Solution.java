import java.util.HashSet;
import java.util.Iterator;
public class Solution {

    public int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i =0; i<nums.length; i++){

            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }else{

                set.add(nums[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
       return it.next();
    }
}
