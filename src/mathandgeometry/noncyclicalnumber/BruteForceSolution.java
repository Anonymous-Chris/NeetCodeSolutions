package mathandgeometry.noncyclicalnumber;

import arraysandhashing.print.PrintItem;

public class BruteForceSolution {
    static void main(String[] args) {
        int val = 100;
        PrintItem.print(isHappy(val));
        int val1 =101;
        PrintItem.print(isHappy(val1));
    }
    public static boolean isHappy(int n) {
        //max param = 1000
        for(int i =0; i<=1000;i++){
            n = sumOfSquares(n);
            if(n ==1){
                return true;
            }
        }
        return false;
    }

    public static int sumOfSquares(int n){
        int sum = 0;
        while (n>0){
            int digit = n % 10;
            sum += digit * digit;
            n = n/10;
        }
        return sum;
    }
}
/*
n = input number
d = number of digits in n
k = fixed iteration i.e. 1000

TC: O(k*d)
SC: O(1)
 */
