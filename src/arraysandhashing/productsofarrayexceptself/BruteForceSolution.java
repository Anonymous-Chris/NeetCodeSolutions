package arraysandhashing.productsofarrayexceptself;

import print.PrintArray;

public class BruteForceSolution {
    static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        PrintArray.printArray(productExceptSelf(nums));
        int[] nums1 = {-1,0,1,2,3};
        PrintArray.printArray(productExceptSelf(nums1));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }
}
// Time Complexity: O(n^2) - We have two nested loops, each iterating through the array of size n.
// Space Complexity: O(n) - We are using an additional array of size n to store the results.