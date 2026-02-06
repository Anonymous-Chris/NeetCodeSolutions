package twopointers.removeduplicatesfromsortedarray;

import print.PrintArray;
import print.PrintItem;

import java.util.ArrayList;
import java.util.List;

public class BruteForceSolution {
    static void main(String[] args) {
        int [] nums = {1, 1, 2, 3, 3, 4, 5};
        PrintArray.printArray(removeDuplicates(nums));
        PrintItem.print(getSize(removeDuplicates(nums)));
    }
    public static int [] removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }
        int [] newNums = new int[list.size()];
        for(int i = 0;i<list.size();i++) {
            newNums[i] = list.get(i);
        }
        return newNums;
    }

    public static int getSize(int [] nums){
        return nums.length;
    }
}
// Time Complexity: O(n) where n is the length of the input array.
// Space Complexity: O(n) for the extra list used to store unique elements.
// This approach uses a list to store unique elements from the sorted array.
// It iterates through the array and adds elements to the list only if they are different from the previous element.
// Finally, it converts the list back to an array and returns it.