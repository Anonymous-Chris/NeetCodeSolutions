package arraysandhashing.topkfrequentelements;

import print.PrintArray;

import java.util.HashMap;
import java.util.List;

public class BucketSortingSolution {
    public class MinHeapSolution {
        static void main(String[] args) {
            int[] nums = {1, 2, 2, 3, 3, 3};
            int k = 2;
            int[] nums1 = {7, 7};
            int k1 = 1;
            PrintArray.printArray(topKFrequent(nums, k));
            PrintArray.printArray(topKFrequent(nums1, k1));
        }

        public static int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int num : nums) {
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }
            // Create frequency buckets
            List<Integer>[] buckets = new List[nums.length + 1];
            for (int key : hashMap.keySet()) {
                int frequency = hashMap.get(key);
                if (buckets[frequency] == null) {
                    buckets[frequency] = new java.util.ArrayList<>();
                }
                buckets[frequency].add(key);
            }

            int[] result = new int[k];
            int index = 0;
            // Traverse buckets from high to low frequency
            for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
                if (buckets[i] != null) {
                    for (int num : buckets[i]) {
                        result[index++] = num;
                        if (index == k) {
                            break;
                        }
                    }
                }
            }
            return result;
        }
    }
}
//TC: O(n) - Building frequency map and buckets takes O(n). Traversing buckets also takes O(n) in total.
//SC: O(n) - For the frequency map and the buckets.
/*
Idea

Frequency ranges from 1 → n
Create buckets where index = frequency
Place numbers in their frequency bucket
Traverse from highest frequency down
 */