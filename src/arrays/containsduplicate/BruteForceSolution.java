package arrays.containsduplicate;

public class BruteForceSolution {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,3};
        int [] nums1 = new int [] {1,2,3,4};

        boolean result = hasDuplicate(nums);
        System.out.println(result);
        boolean result1 = hasDuplicate(nums1);
        System.out.println(result1);
    }

    public static boolean hasDuplicate(int[] nums) {
        for(int i =0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
//TC: O(n^2)
//SC: O(1)
//No extra data structures are used.
//Only loop variables (i, j) and a boolean return value.
//Space does not grow with input size.