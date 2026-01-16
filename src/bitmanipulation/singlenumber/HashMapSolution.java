package bitmanipulation.singlenumber;

import arrays.print.PrintItem;

import java.util.HashMap;

public class HashMapSolution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        PrintItem.print(singleNumber(nums));
        int[] nums1 = {7, 6, 6, 7, 8};
        PrintItem.print(singleNumber(nums1));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num: nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for(int num: nums){
            if(hashMap.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}
//TC: O(n)
//SC: O(n) as used hashmap for storing n items