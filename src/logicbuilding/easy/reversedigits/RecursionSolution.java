package logicbuilding.easy.reversedigits;

public class RecursionSolution {
    public static void main(String[] args) {
        int num = 4562;
        int[] reverseNumber = {0};
        int[] basePosition = {1};
        System.out.println(reverseDigits(num, reverseNumber, basePosition));
    }

    public static int reverseDigits(int n, int [] reverseNumber, int [] basePosition) {
        if(n>0){
            reverseDigits(n/10, reverseNumber, basePosition);
            reverseNumber[0] = reverseNumber[0] + (n%10)*basePosition[0];
            basePosition[0] = basePosition[0]*10;
        }
        return reverseNumber[0];
    }
}
//TC: O(logn) - where d is the number of digits in the input number n. The recursive function is called once for each digit in n.
//SC: O(logn) - The space complexity is O(d) due to the recursive call stack. Each recursive call adds a new frame to the stack, and in the worst case (when n has d digits), the stack will have d frames before it starts unwinding. Additionally, we are using a constant amount of space for the reverseNumber and basePosition arrays, which does not grow with the size of the input number. However, the dominant factor in space complexity is the recursive call stack, leading to O(d) space complexity.
// Note: The use of arrays for reverseNumber and basePosition is a workaround to allow modification of these values across recursive calls, as Java does not support passing primitive types by reference.
//The values of int doesnt change over iterations of the recursive calls, so we can use arrays to hold these values and modify them across the recursive calls. This way, we can keep track of the reversed number and the base position as we build the reversed number recursively.
//isnt it log(n) because we are dividing n by 10 in each recursive call?