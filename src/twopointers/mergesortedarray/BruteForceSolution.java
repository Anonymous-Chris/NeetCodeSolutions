package twopointers.mergesortedarray;

import print.PrintArray;

import java.util.Arrays;

public class BruteForceSolution {
    static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int [] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        PrintArray.printArray(merge(nums1,m,nums2,n));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        //copy in another arary
        for(int i = 0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
// Time Complexity: O((m+n)log(m+n)) due to sorting
// Space Complexity: O(1) as we are not using any extra space except for variables
// This is a brute-force approach to merge two sorted arrays by copying elements and sorting the result.
// Optimal approach would be to use two pointers to merge in O(m+n) time.