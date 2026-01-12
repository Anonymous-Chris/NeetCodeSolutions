package arrays.twosum;

public class BruteForceSolution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 6};
        int target = 7;

        int[] result = twoSum(nums, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && nums[i] != nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}

//TC: O(n^2)
//SC: O(1) as the return is always array of size 2 i.e. constant
//Nested loop only affect TC. SC only cares about memory usage not how many times it was run