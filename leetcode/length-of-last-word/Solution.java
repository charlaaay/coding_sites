public class Solution {

    public int lengthOfLastWord(String s) {

        s = s.trim();

        if(s.length() == 0) {

            System.out.println("first");

            return 0;

        }

        int num = 0;

        for(int i = s.length()-1; i>=0;i--){

            

            if(s.charAt(i) ==' ' && num>0){

                System.out.println("second");

                return num;

            }

            

            num++;

            System.out.println("num is " + num );

        }

        System.out.println("third");

        return num;

    }

}
