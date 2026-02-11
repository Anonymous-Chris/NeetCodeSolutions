package logicbuilding.basic.sumofnnaturalnumbers;

import print.PrintItem;

public class BruteForceSolution {
    static void main(String[] args) {
        PrintItem.print(sumOfNNaturalNumbers(9));
    }

    static int sumOfNNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
//TC: O(n) - We iterate from 1 to n to calculate the sum of the first n natural numbers.
//SC: O(1) - We are using a constant amount of space to store the sum variable, regardless of the input size n.