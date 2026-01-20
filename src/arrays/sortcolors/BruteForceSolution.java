package arrays.sortcolors;

import arrays.print.PrintArray;

import java.util.Arrays;

public class BruteForceSolution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 3, 2, 1, 3};
        int[] nums1 = {3, 2, 1, 2, 1, 2, 1};
        PrintArray.printArray(nums);
        PrintArray.printArray(sortArray(nums));
        PrintArray.printArray(nums1);
        PrintArray.printArray(sortArray(nums1));

    }

    public static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
//TC: O(nlogn)
//SC: O(1) or O(log n) (depends on sort implementation)