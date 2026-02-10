package logicbuilding.sumofnnaturalnumbers;

import print.PrintItem;

public class OptimalSolution {
    static void main(String[] args) {
        PrintItem.print(sumOfNNaturalNumbers(9));
    }

    static int sumOfNNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
//TC: O(1) - The formula n * (n + 1) / 2 allows us to calculate the sum of the first n natural numbers in constant time, regardless of the value of n.
//SC: O(1) - We are using a constant amount of space to store the result of the formula, regardless of the input size n.
