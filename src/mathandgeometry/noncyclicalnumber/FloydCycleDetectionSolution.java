package mathandgeometry.noncyclicalnumber;

import print.PrintItem;

public class FloydCycleDetectionSolution {
    static void main(String[] args) {
        int val = 100;
        PrintItem.print(isHappy(val));
        int val1 =101;
        PrintItem.print(isHappy(val1));
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }while (slow != fast);
        return slow == 1;
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
Idea

Treat it like a linked list:
slow moves 1 step
fast moves 2 steps
If they meet → cycle
If they meet at 1 → success

TC: O(d*logn)
SC: O(1)
 */