package print;

public class PrintArray {
    // Print array helper
    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void printArray(char [] arr) {
        for (char n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
