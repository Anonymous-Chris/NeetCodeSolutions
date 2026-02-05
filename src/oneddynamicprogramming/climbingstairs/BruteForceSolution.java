package oneddynamicprogramming.climbingstairs;

import print.PrintItem;

public class BruteForceSolution {
    public static void main(String[] args) {
        int n = 2;
        PrintItem.print(climbStairs(n));
        int n1 =3;
        PrintItem.print(climbStairs(n1));
    }

    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
/*To reach n we have to take (n-1) or (n-2) steps i.e. 1 or 2 step
dp[n] = dp[n-1] + dp[n-2]
TC: O(n2)
SC: O(n) -> recursion stack
 */