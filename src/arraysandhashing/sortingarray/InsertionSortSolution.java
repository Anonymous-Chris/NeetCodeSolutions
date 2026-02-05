package arraysandhashing.sortingarray;

public class InsertionSortSolution {
    public static void main(String[] args) {
        int [] nums = {10,9,1,1,1,2,3,1};
        System.out.println(sortArray(nums));
        int [] nums1 = {5,10,2,1,3};
        System.out.println(sortArray(nums1));
        for(int n: nums1){
            IO.print(n + ",");
        }
    }
    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i=1; i<n; i++){
            //element to insert
            int key = nums[i];
            int j = i-1;
            // shift elements of sorted portion to the right to make space
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
}
// TC: O(n^2) worst case, O(n) best case (already sorted)
// SC: O(1)
// Build a sorted portion of the array by inserting each element into its correct position
// After each pass, the sorted portion grows by one element
// Insertion sort is adaptive: it runs faster on nearly sorted arrays and always uses constant space
/*

5,10,2,1,3
5,10,2,1,3
5,2,10,1,3 -> j=1
2,5,10,1,3 -> j =0
1,2,5,10,3 -> j =0
1,2,3,5,10 -> j =0

*/