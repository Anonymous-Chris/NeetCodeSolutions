package arraysandhashing.sortcolors;

import arraysandhashing.print.PrintArray;

public class DutchNationalFlagSolution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 3, 2, 1, 3};
        int[] nums1 = {3, 2, 1, 2, 1, 2, 1};
        PrintArray.printArray(nums);
        PrintArray.printArray(sortArray(nums));
        PrintArray.printArray(nums1);
        PrintArray.printArray(sortArray(nums1));

    }

    public static int[] sortArray(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
        return nums;
    }
    private static void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    }

//alternative is heap sort
//TC: O(n)
//SC: O(1)