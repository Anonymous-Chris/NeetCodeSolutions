package bitmanipulation.singlenumber;

import arrays.print.PrintItem;

public class BruteForceSolution {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        PrintItem.print(singleNumber(nums));
        int [] nums1 = {7,6,6,7,8};
        PrintItem.print(singleNumber(nums1));
    }
    public static int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for (int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }
}
//TC: O(n^2)
//SC: O(1) as only one count variable is used
