package logicbuilding.basic.swaptwonumbers;

public class BitwiseOperatorSolution {
    static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }

    private static void swap(int a, int b) {
        a = a ^ b; // a now holds the result of a XOR b
        b = a ^ b; // b now holds the original value of a
        a = a ^ b; // a now holds the original value of b
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
//TC: O(1) - The swap operation takes constant time as it involves a fixed number of steps regardless of the input values.
//SC: O(1) - The space complexity is constant as we are using a fixed

/* Using XOR operator to swap values without a temporary variable
 XOR of two numbers will give us a number that has bits set to 1 where the bits of the two numbers differ
 Step 1: a now holds the result of a XOR b
 Step 2: b now holds the original value of a (since a XOR b XOR b = a)
 Step 3: a now holds the original value of b (since a XOR b XOR a = b)

 example: a = 5 (0101 in binary), b = 10 (1010 in binary)
 Step 1: a = a XOR b -> a = 0101 XOR 1010 = 1111 (15 in decimal)
 Step 2: b = a XOR b -> b = 1111 XOR 1010 = 0101 (5 in decimal, original value of a)
 Step 3: a = a XOR b -> a = 1111 XOR 0101 = 1010 (10 in decimal, original value of b)
 */