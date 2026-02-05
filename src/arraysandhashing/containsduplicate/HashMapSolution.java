package arraysandhashing.containsduplicate;

import java.util.HashMap;

public class HashMapSolution {

    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,3};
        int [] nums1 = new int [] {1,2,3,4};

        boolean result = hasDuplicate(nums);
        System.out.println(result);
        boolean result1 = hasDuplicate(nums1);
        System.out.println(result1);
    }

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num:nums){
            if(hashMap.containsKey(num)){
                return true;
            }
            hashMap.put(num,1);
        }
        return false;
    }
}
//keep adding to hasmap and if duplicate found return true else not
//TC: O(n)
//SC: O(n) i.e. worst case scenario is n items in hashmap