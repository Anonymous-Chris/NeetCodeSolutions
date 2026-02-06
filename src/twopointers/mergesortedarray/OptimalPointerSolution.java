package twopointers.mergesortedarray;

import print.PrintArray;

public class OptimalPointerSolution {
    static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int [] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        PrintArray.printArray(merge(nums1,m,nums2,n));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // last real element in nums1
        int j = n - 1;        // last element in nums2
        int k = m + n - 1;    // last index of nums1 (including extra space)

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        // Copy remaining elements from nums2, if any
        while (j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        return nums1;
    }
}
// Time Complexity: O(m + n) where m and n are the lengths of nums1 and nums2 respectively.
// Space Complexity: O(1) as we are merging in place without using extra space.
// This approach uses two pointers starting from the end of both arrays to merge them in place.
// It compares elements from the end and places the larger one at the end of nums1, effectively merging the arrays without needing extra space.
