package arraysandhashing.sortingarray;

public class QuickSortSolution {
    public static void main(String[] args) {
        int [] nums = {10,9,1,1,1,2,3,1};
        int [] nums1 = {5, 10, 2, 1, 3};
        System.out.println("Initial array: ");
        printArray(nums);
        quickSort(nums, 0, nums.length - 1);
        System.out.println("Sorted array: ");
        printArray(nums);
        System.out.println("Initial array: ");
        printArray(nums1);
        quickSort(nums1, 0, nums1.length - 1);
        System.out.println("Sorted array: ");
        printArray(nums1);
    }

    public static void quickSort(int [] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            // Recursively sort left and right subarrays
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    // Partition function (last element as pivot)
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        //place pivot in correct position
        swap(arr, i+1, high);
        return i+1;
    }

    // Swap helper
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Print array helper
    private static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    }
// TC: O(n log n) average/best, O(n^2) worst case
// SC: O(log n) due to recursion
// QuickSort is a divide-and-conquer algorithm
// Pick a pivot element, partition the array so that all smaller elements go left and all larger go right
// Recursively apply the same process to left and right subarrays
// After each partition, pivot element is in its correct final position
/*

 */