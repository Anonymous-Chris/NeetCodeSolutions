package arrays.sortingarray;

import java.util.Arrays;

public class BuiltInSolution {
    public static void main(String[] args) {
        int [] nums = {10,9,1,1,1,2,3,1};
        System.out.println(sortArray(nums));
        int [] nums1 = {5,10,2,1,3};
        System.out.println(sortArray(nums1));
    }
    public static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
