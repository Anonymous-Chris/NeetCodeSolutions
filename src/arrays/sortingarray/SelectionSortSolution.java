package arrays.sortingarray;

public class SelectionSortSolution {
    public static void main(String[] args) {
        int[] nums = {10, 9, 1, 1, 1, 2, 3, 1};
        System.out.println(sortArray(nums));
        int[] nums1 = {5, 10, 2, 1, 3};
        System.out.println(sortArray(nums1));
        for (int n : nums1) {
            IO.print(n + ",");
        }
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int smallestIndex = i;
            //find smallest in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            //swap smallest with first unsorted element
            int temp = nums[i];
            nums[i] = nums[smallestIndex];
            nums[smallestIndex] = temp;
        }
        return nums;
    }
}
//TC: O(n2)
//SC: O(1)
//Repeatedly select the smallest element from the unsorted part
//Swap it with the first unsorted position
//After each pass, one element is fixed in its final place
//Selection sort repeatedly selects the smallest element from the unsorted portion and places it in its correct position. It always runs in O(n²) time and uses constant space.
/*
5,10,2,1,3
1,10,2,5,3
1,2,10,5,3
1,2,3,5,10
 */