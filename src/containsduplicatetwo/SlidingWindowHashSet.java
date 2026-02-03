package containsduplicatetwo;

import arrays.print.PrintItem;

import java.util.HashSet;

public class SlidingWindowHashSet {
    static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int k = 3;
        int [] nums1 = {2,1,2};
        int k1 = 1;
        PrintItem.print(containsNearbyDuplicate(nums,k));
        PrintItem.print(containsNearbyDuplicate(nums1,k1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<nums.length;i++){
            if(hashSet.contains(nums[i])){
                return true;
            }
            hashSet.add(nums[i]);

            // keep window size <= k
            if(hashSet.size() > k){
                hashSet.remove(nums[i-k]);
            }
        }
        return false;
    }
}
//TC: O(n)
//SC: O(k)
/*At any index i, the set contains only elements from indices:
[i - k , i - 1]
This is the sliding window.

hashSet.remove(nums[i-k]);
Why is this needed?

The window should never hold more than k elements.

If it grows to k + 1, that means:

The oldest element is now too far away

We must remove it

Why nums[i - k]?

That value is exactly the element that:

Was added k steps ago

Is now outside the valid range

Full Dry Run Example
nums = [1, 2, 3, 1]
k = 2

i	nums[i]	set before	contains?	set after add	removal	set final
0	1	{}	no	{1}	—	{1}
1	2	{1}	no	{1,2}	—	{1,2}
2	3	{1,2}	no	{1,2,3}	remove nums[0]=1	{2,3}
3	1	{2,3}	no	{2,3,1}	remove nums[1]=2	{3,1}

🚫 No duplicate within distance k → false
 */