package arraysandhashing.topkfrequentelements;

import print.PrintArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BruteForceSolution {
    static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;
        int[] nums1 = {7,7};
        int k1 = 1;
        PrintArray.printArray(topKFrequent(nums, k));
        PrintArray.printArray(topKFrequent(nums1, k1));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(hashMap.keySet());
        list.sort((a, b) -> hashMap.get(b) - hashMap.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
//TC: O(n log n) due to sorting
//SC: O(n) for the hashmap and list storage