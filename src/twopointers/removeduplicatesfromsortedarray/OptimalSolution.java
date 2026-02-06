package twopointers.removeduplicatesfromsortedarray;

import print.PrintArray;
import print.PrintItem;

public class OptimalSolution {
    static void main(String[] args) {
        int [] nums = {1, 1, 2, 3, 3, 4, 5};
        PrintItem.print(removeDuplicates(nums));
    }
    public static int  removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i =0; // pointer for unique elements
        for(int j =1; j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1; // size of unique elements
    }
}
// Time Complexity: O(n) where n is the length of the input array.
// Space Complexity: O(1) as we are modifying the array in place without using extra space.
// This approach uses two pointers to remove duplicates from a sorted array in place.
// The first pointer (i) keeps track of the position of the last unique element, while
/*
nums = [1,1,2,2,3]

i=0, j=1 → same → skip
j=2 → new value → i=1 → nums[1]=2
j=3 → same → skip
j=4 → new value → i=2 → nums[2]=3

Result: [1,2,3,_ ,_]
k = 3

 */