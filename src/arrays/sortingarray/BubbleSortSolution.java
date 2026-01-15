package arrays.sortingarray;

public class BubbleSortSolution {
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
        for(int i = 0; i<n-1;i++){
            for(int j = 0; j< n-1-i; j++){
                if(nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    }
//Repeatedly swap adjacent elements if they’re in the wrong order.
//Largest element “bubbles” to the end.
//TC: O(n2)
//SC: O(1)
/*

1,5,4,2,8
1,4,5,2,8
1,4,2,5,8 and so on...
 */