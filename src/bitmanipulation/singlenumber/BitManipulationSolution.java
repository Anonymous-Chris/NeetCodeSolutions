package bitmanipulation.singlenumber;

import arraysandhashing.print.PrintItem;

public class BitManipulationSolution {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        PrintItem.print(singleNumber(nums));
        int [] nums1 = {7,6,6,7,8};
        PrintItem.print(singleNumber(nums1));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int num:nums){
            int currentResult = result;
            int xorValue = currentResult ^ num;
            result = xorValue;
        }
        return result;
    }
    }
/*
TC: O(n)
SC: O(1)
nums = [2, 1, 2]

result = 0
result = 0 ^ 2 = 2
result = 2 ^ 1 = 3
result = 3 ^ 2 = 1
 */