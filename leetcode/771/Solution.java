class Solution {
    public int numJewelsInStones(String J, String S) {
        
        char[] stones = S.toCharArray();

        int count = 0;
        for (char stone : stones) {
            if (J.indexOf(stone) != -1) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String jewels = "";
        String stones = "";

        System.out.println(sol.numJewelsInStones(jewels, stones));
    }
}