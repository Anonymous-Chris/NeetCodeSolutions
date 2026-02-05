package slidingwindow.containsduplicatetwo;

import print.PrintItem;

public class BruteForceSolution {
    static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int k = 3;
        int [] nums1 = {2,1,2};
        int k1 = 1;
        PrintItem.print(containsNearbyDuplicate(nums,k));
        PrintItem.print(containsNearbyDuplicate(nums1,k1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i =0 ; i< n;i++){
            for(int j = i+1; j<n; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
//TC: O(n2)
//SC: O(1)