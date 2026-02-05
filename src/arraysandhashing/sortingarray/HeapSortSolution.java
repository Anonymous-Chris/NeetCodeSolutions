package arraysandhashing.sortingarray;

public class HeapSortSolution {
    public static void main(String[] args) {
        int[] nums = {5, 10, 2, 1, 3};
        System.out.println("Initial array:");
        printArray(nums);

        heapSort(nums);

        System.out.println("Sorted array:");
        printArray(nums);
    }

    // Heap Sort function
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to the end
            swap(arr, 0, i);

            // Heapify the reduced heap
            heapify(arr, i, 0);

            // Optional: print array after each extraction
            System.out.print("After moving largest to index " + i + ": ");
            printArray(arr);
        }
    }

    // Heapify subtree rooted at index i for heap of size n
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) largest = right;

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Swap helper
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Print array helper
    private static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}

// TC: O(n log n) in best, average, worst case
// SC: O(1) (in-place sorting)
// Heap Sort is a comparison-based algorithm
// 1. Build a max-heap from the array
// 2. Swap the root (largest element) with the last element
// 3. Reduce heap size and heapify the root
// 4. Repeat until the heap size is 1
// After each extraction, the largest element moves to its final position