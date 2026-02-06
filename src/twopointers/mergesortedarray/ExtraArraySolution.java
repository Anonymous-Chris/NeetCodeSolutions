package twopointers.mergesortedarray;

import print.PrintArray;

public class ExtraArraySolution {
    static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int [] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        PrintArray.printArray(merge(nums1,m,nums2,n));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }
        // Copy remaining elements from nums1, if any
        while (i < m) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        // Copy remaining elements from nums2, if any
        while (j < n) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
// Time Complexity: O(m + n) where m and n are the lengths of nums1 and nums2 respectively.
// Space Complexity: O(m + n) for the extra array used to store the merged result
// This approach uses an extra array to merge two sorted arrays efficiently using the two-pointer technique.
// It iter iterates through both arrays and merges them in sorted order.
// Note: This solution returns a new merged array instead of modifying nums1 in place.
// If in-place modification of nums1 is required, a different approach would be needed.