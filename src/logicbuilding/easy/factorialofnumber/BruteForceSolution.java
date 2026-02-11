package logicbuilding.easy.factorialofnumber;

public class BruteForceSolution {
    public static void main(String[] args) {
        int n = 5;
        long result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static long factorial(int n) {
        int result = 1;
        while(n>0){
            result *= n;
            n--;
        }
        return result;
    }
}
//TC: O(n) - The loop runs n times, where n is the input number.
//SC: O(1) - We are using a constant amount of space to store the result and the loop variable.