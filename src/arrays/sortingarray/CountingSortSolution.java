package arrays.sortingarray;

public class CountingSortSolution {

    public static void main(String[] args) {
        int[] nums = {5, 10, 2, 1, 3};
        System.out.println("Initial array:");
        printArray(nums);

        countingSort(nums);

        System.out.println("Sorted array:");
        printArray(nums);
    }

    public static void countingSort(int[] arr) {
        int n = arr.length;
        // Find max value to know size of count array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // count array
        int[] count = new int[max + 1];
        // output array
        int[] output = new int[n];
        // Step 1: Count occurrences
        for (int num : arr) {
            count[num]++;
        }

        // Step 2: Compute cumulative counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Step 4: Copy output back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    private static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}
