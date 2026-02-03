package containsduplicatetwo;

import arrays.print.PrintItem;

import java.util.HashMap;

public class HashMapSolution {
    static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int k = 3;
        int [] nums1 = {2,1,2};
        int k1 = 1;
        PrintItem.print(containsNearbyDuplicate(nums,k));
        PrintItem.print(containsNearbyDuplicate(nums1,k1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0 ; i<nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                //last position where that no appeared
                int previousIndex = hashMap.get(nums[i]);
                if(i-previousIndex <= k) {
                    return true;
                }
            }
            //update index
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
/*
TC: O(n)
SC: O(n)

Full Dry Run Example
nums = [1, 2, 3, 1]
k = 3

i	nums[i]	map before	prevIndex	i - prevIndex	action
0	1	{}	—	—	put (1 → 0)
1	2	{1→0}	—	—	put (2 → 1)
2	3	{1→0,2→1}	—	—	put (3 → 2)
3	1	{1→0,2→1,3→2}	0	3 ≤ 3 ✔	return true
Why this is correct

Always compares current index with closest previous index

Guarantees minimal distance check

Handles all cases cleanly
 */