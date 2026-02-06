package twopointers.removeduplicatesfromsortedarray;

import print.PrintArray;
import print.PrintItem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetSolution {
    static void main(String[] args) {
        int [] nums = {1, 1, 2, 3, 3, 4, 5};
        PrintArray.printArray(removeDuplicates(nums));
        PrintItem.print(getSize(removeDuplicates(nums)));
        PrintItem.print(getHashSetSize(removeDuplicates(nums)));

    }
    public static int [] removeDuplicates(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i: nums){
            hashSet.add(i);
        }
        return hashSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int getSize(int [] nums){
        return nums.length;
    }

    public static int getHashSetSize(int [] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i: nums){
            hashSet.add(i);
        }
        return hashSet.size();
    }
}
// Time Complexity: O(n) where n is the length of the input array.
// Space Complexity: O(n) for the HashSet used to store unique elements.
// This approach uses a HashSet to store unique elements from the sorted array.
// It iterates through the array and adds elements to the HashSet, which automatically handles duplicates.
// Finally, it converts the HashSet back to an array and returns it.
// Note: This solution does not maintain the order of elements and is not in-place. If in-place modification is required, a different approach would be needed.