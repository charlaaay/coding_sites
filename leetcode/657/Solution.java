class Solution {
    public boolean judgeCircle(String moves) {

        //indexes positions are Left, Right, Up, Down
        int[] sums = {0,0,0,0};

        char[] charCommands = moves.toCharArray();

        for (char command : charCommands) {

            switch (command) {

                case 'L':
                    sums[0]++;
                    break;
                case 'R':
                    sums[1]++;
                    break;
                case 'U':
                    sums[2]++;
                    break;
                case 'D':
                    sums[3]++;
                    break;
                default:
                    System.out.println("Invalid input given. " + command);
                    break;
            }
        }

        if (charCommands.length > 0 && sums[0] == sums[1] && sums[2] == sums[3]) {
            return true;
        }
        return false;
        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.judgeCircle(""));   
    }
}