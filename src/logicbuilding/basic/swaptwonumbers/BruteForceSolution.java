package logicbuilding.basic.swaptwonumbers;

public class BruteForceSolution {
    static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
//TC: O(1) - The swap operation takes constant time as it involves a fixed number of steps regardless of the input values.
//SC: O(1) - The space complexity is constant as we are using a fixed