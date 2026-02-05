package arraysandhashing.majorityelement;

import java.util.HashMap;

public class BruteForceSolution {
    public static void main(String[] args) {
        int [] nums = {5,5,1,1,1,5,5};
        System.out.println(majorityElement(nums));
        int [] nums1 = {2,2,2};
        System.out.println(majorityElement(nums1));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int majority = nums[0];
        int maxCount = 0;
        for(int n:nums){
            hashMap.put(n, hashMap.getOrDefault(n,0)+1);
            if(hashMap.get(n) > maxCount){
                maxCount = hashMap.get(n);
                majority = n;
            }
        }
        return majority;
    }
}
//TC: O(n)
//SC: O(n)
