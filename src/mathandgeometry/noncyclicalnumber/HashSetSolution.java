package mathandgeometry.noncyclicalnumber;

import print.PrintItem;

import java.util.HashSet;

public class HashSetSolution {
    static void main(String[] args) {
        int val = 100;
        PrintItem.print(isHappy(val));
        int val1 =101;
        PrintItem.print(isHappy(val1));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (n != 1){
            if(hashSet.contains(n)){
                return false;
            }
            hashSet.add(n);
            n = sumOfSquares(n);
        }
        return true;
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
TC: O(d*logn)
SC: O(logn)
 */