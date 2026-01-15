package arrays.sortingarray;

public class MergeSortSolution {
    public static void main(String[] args) {
        int [] nums = {10,9,1,1,1,2,3,1};
        int [] nums1 = {5, 10, 2, 1, 3};
        System.out.println("Initial array: ");
        printArray(nums);
        mergeSort(nums, 0, nums.length - 1);
        System.out.println("Sorted array: ");
        printArray(nums);
        System.out.println("Initial array: ");
        printArray(nums1);
        mergeSort(nums1, 0, nums1.length - 1);
        System.out.println("Sorted array: ");
        printArray(nums1);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(left<right){
            int mid = (left+right)/2;
            // Sort first half
            mergeSort(arr, left, mid);

            // Sort second half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left +1;
        int n2 = right - mid;
        // Create temp arrays
        int [] L = new int[n1];
        int [] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        // Merge the temp arrays
        // Initial indices of first and second subarrays
        // K is initial index of merged subarray
        int i = 0, j = 0, k = left;

        while (i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
        // Print array helper
    private static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
// TC: O(n log n) in best, average, and worst case
// SC: O(n) due to temporary arrays for merging
// Merge Sort is a divide-and-conquer algorithm
// 1. Divide the array into two halves
// 2. Recursively sort each half
// 3. Merge the two sorted halves into a single sorted array
// After each merge, the merged portion is sorted