// O(n^2)
class Solution {
    public int rob(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        int[] maxMoney = new int[nums.length];
        int overallMaxMoney = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxMoney[i] = nums[i];
            if (i >= 2) {
                maxMoney[i] = nums[i] + computeMinBasedOnIndex(maxMoney, i-2);
            }
            if (overallMaxMoney < maxMoney[i]) {
                overallMaxMoney = maxMoney[i];
            }
        }
        return overallMaxMoney;
    }
    
    //Given an index, return the max value that is <= that index
    private int computeMinBasedOnIndex(int[] maxMoney, int index) {
        if (maxMoney.length == 0) {
            return 0;
        }
        if (index >= maxMoney.length) {
            //aint nobody got time for that
            return 0;
        }
        int overallMax = maxMoney[0];
        for (int i = 0; i<=index; i++) {
            overallMax = Math.max(overallMax, maxMoney[i]);
        }
        return overallMax;
    }
}
