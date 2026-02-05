package arraysandhashing.twosum;

import java.util.HashMap;

public class HashMapSolution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 6};
        int target = 7;

        int[] result = twoSum(nums, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int remaining = target - nums[i];
            if(hashMap.containsKey(remaining)){
                return new int []{hashMap.get(remaining), i};
            }
            hashMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

//TC : O(n)
//SC : O(n) as (Hasmap can store n elements in worst case)
//HashMap.containsKey() → O(1)
//HashMap.put() → O(1)