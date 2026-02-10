package logicbuilding.sumofnnaturalnumbers;

import print.PrintItem;

public class RecursionSolution {
    static void main(String[] args) {
        PrintItem.print(sumOfNNaturalNumbers(9));
    }

    static int sumOfNNaturalNumbers(int n) {
        if(n==1){
            return 1;
        }
        return n + sumOfNNaturalNumbers(n-1);
    }
}
//TC: O(n) - The function calls itself n times until it reaches the base case (n=1).
//SC: O(n) - The maximum depth of the recursion is n, which occurs when n is reduced to 1. Each function call adds a layer to the call stack, resulting in O(n) space complexity.