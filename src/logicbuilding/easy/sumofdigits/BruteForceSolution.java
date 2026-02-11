package logicbuilding.easy.sumofdigits;

public class BruteForceSolution {
    public static void main(String[] args) {
        int n = 12345;
        int result = sumDigits(n);
        System.out.println("The sum of digits in " + n + " is: " + result);
    }

    public static int sumDigits(int n) {
        int result = 0;
        while(n>0){
            int lastDigit = n%10; // Get the last digit
            result += lastDigit; // Add it to the result
            n = n/10; // Remove the last digit
        }
        return result;
    }
}
//TC: O(d) - where d is the number of digits in the input number n. In the worst case, if n has d digits, we will perform d iterations to sum all the digits.
//SC: O(1) - We are using a constant amount of space to store the result and the last digit, regardless of the size of the input number n.