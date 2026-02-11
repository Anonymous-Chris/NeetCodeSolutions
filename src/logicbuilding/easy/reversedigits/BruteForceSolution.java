package logicbuilding.easy.reversedigits;

public class BruteForceSolution {
    public static void main(String[] args) {
        int num = 4562;
        System.out.println(reverseDigits(num));
    }

    public static int reverseDigits(int n) {
        int reverseNumber = 0;
        while (n>0){
            reverseNumber = reverseNumber * 10 + n % 10;
            n = n / 10;
        }
        return reverseNumber;
    }
}
//TC: O(d) - where d is the number of digits in the input number n. The while loop iterates once for each digit in n.
//SC: O(1) - We are using a constant amount of space to store the reversed number and a few temporary variables. The space used does not grow with the size of the input number.