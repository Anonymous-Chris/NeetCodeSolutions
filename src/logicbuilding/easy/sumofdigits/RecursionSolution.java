package logicbuilding.easy.sumofdigits;

public class RecursionSolution {
    public static void main(String[] args) {
        int n = 12345;
        int result = sumDigits(n);
        System.out.println("The sum of digits in " + n + " is: " + result);
    }

    public static int sumDigits(int n) {
        if(n ==0){
            return 0;
        }
        int lastDigit = n%10; // Get the last digit
        return lastDigit + sumDigits(n/10); // Add it to the result of the recursive call with the remaining digits
    }
}
//TC: O(d) - where d is the number of digits in the input number n. In the worst case, if n has d digits, we will perform d recursive calls to sum all the digits.
//SC: O(d) - The space complexity is O(d) due to the recursive call stack. In the worst case, if n has d digits, the maximum depth of the recursion will be d, which means we will have d function calls on the call stack at the same time.
//example: For n = 12345, the recursive calls will be as follows:
// sumDigits(12345) -> lastDigit = 5, calls sumDigits(1234)
// sumDigits(1234) -> lastDigit = 4, calls sumDigits(123)
// sumDigits(123) -> lastDigit = 3, calls sumDigits(12)
// sumDigits(12) -> lastDigit = 2, calls sumDigits(1)
// sumDigits(1) -> lastDigit = 1, calls sumDigits(0)
// sumDigits(0) -> returns 0