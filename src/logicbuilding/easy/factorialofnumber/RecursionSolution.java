package logicbuilding.easy.factorialofnumber;

public class RecursionSolution {
    public static void main(String[] args) {
        int n = 5;
        long result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static long factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }
}
//TC: O(n) - The function makes n recursive calls until it reaches the base case.
//SC: O(n) - The maximum depth of the recursion is n, which means we are using O(n) space on the call stack.