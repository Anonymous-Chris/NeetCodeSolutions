package logicbuilding.basic.sumofsquaresofnnumbers;

public class OptimalSolution {
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(sumofSquares(n));
    }

    static int sumofSquares(int n){
        return n * (n + 1) * (2 * n + 1) / 6;
    }
}
//TC: O(1) - The formula n * (n + 1) * (2 * n + 1) / 6 allows us to calculate the sum of squares of the first n natural numbers in constant time, regardless of the value of n.
//SC: O(1) - We are using a constant amount of space to store the result of the formula, regardless of the input size n.