package logicbuilding.basic.swaptwonumbers;

public class MathWithoutNewVariableSolution {
    static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }

    private static void swap(int a, int b) {
        a = a + b; // a now holds the sum of a and b
        b = a - b; // b now holds the original value of a
        a = a - b; // a now holds the original value of b
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
//TC: O(1) - The swap operation takes constant time as it involves a fixed number of steps regardless of the input values.
//SC: O(1) - The space complexity is constant as we are using a fixed amount of space to store the variables a and b, regardless of the input values.