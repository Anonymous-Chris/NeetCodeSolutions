package bitmanipulation.singlenumber;

import arrays.print.PrintItem;

import java.util.Arrays;

public class SortingSolution {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        PrintItem.print(singleNumber(nums));
        int [] nums1 = {7,6,6,7,8};
        PrintItem.print(singleNumber(nums1));
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1;i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
    }
//index is +2 as it always is in pair
//TC: O(nlogn)
//SC: O(1) or O(logn) based on sort