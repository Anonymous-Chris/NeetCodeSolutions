package logicbuilding.easy.reversedigits;

public class StringSolution {
    public static void main(String[] args) {
        int num = 4562;
        System.out.println(reverseDigits(num));
    }

    public static int reverseDigits(int n) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(n));
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }
}
//TC: O(logn)
//Sc: O(1) - We are using a constant amount of space to store the reversed number and a few temporary variables. The space used does not grow with the size of the input number. However, the StringBuilder and the string representation of the number do take up space, but this is generally considered negligible compared to the overall complexity of the algorithm.