/**
This algo works by storing each uglynumber that it finds onto a list. The initial list only contains
1 element (value = 1), and each new ugly number is appended onto the list.
I use 3 pointers, one that multiples the index pointed at by 2,3,5, respectively. The next number
to be added to the list is X[i]* 2, X[j]*3, X[k]*5
*/


class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int lastNumber = 1;
        int current2Pointer = 0;
        int current3Pointer = 0;
        int current5Pointer = 0;
        int optionA = uglyNumbers[0];
        int optionB = uglyNumbers[0];
        int optionC = uglyNumbers[0];
        
        for(int i = 1; i < n; i++) {
            
            optionA = uglyNumbers[current2Pointer] * 2;
            optionB = uglyNumbers[current3Pointer] * 3;
            optionC = uglyNumbers[current5Pointer]  * 5;

            while (optionA <= lastNumber) {
                current2Pointer++;
                optionA = uglyNumbers[current2Pointer] * 2;
            }
            while (optionB <= lastNumber) {
                current3Pointer++;
                optionB = uglyNumbers[current3Pointer] * 3;
            }
            while (optionC <= lastNumber) {
                current5Pointer++;
                optionC = uglyNumbers[current5Pointer]  * 5;
            }
            
            if (optionA <= optionB) {
                if (optionA <= optionC) {
                    current2Pointer++;
                    lastNumber = uglyNumbers[i] = optionA;
                } else {
                    current5Pointer++;
                   lastNumber = uglyNumbers[i] = optionC;
                }
            } else {
                if (optionB <= optionC) {
                    current3Pointer++;
                    lastNumber = uglyNumbers[i] = optionB;
                } else {
                    current5Pointer++;
                    lastNumber = uglyNumbers[i] = optionC;
                }
            }
        }
        return lastNumber;
    }
}
