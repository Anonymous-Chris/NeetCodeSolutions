package arraysandhashing.topkfrequentelements;

import print.PrintArray;

import java.util.HashMap;
import java.util.PriorityQueue;

public class MinHeapSolution {
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
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> hashMap.get(a) - hashMap.get(b));
        for (int key : hashMap.keySet()) {
            heap.offer(key);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}
//TC: O(n log k) due to heap operations and sorting
//SC: O(n) for the hashmap and heap storage
/*
offer(E e): inserts e into the heap, maintaining the heap invariant. Returns true if the element was added. (For unbounded PriorityQueue offer and add behave the same; offer can return false only for bounded queues.) Time complexity: O(log n).
poll(): removes and returns the heap head (the highest‑priority element — smallest by natural order or according to the comparator). Returns null if the queue is empty. Time complexity: O(log n). After removal the heap is rebalanced.
Related: peek() returns the head without removing (null if empty, O(1)). remove() / element() behave like poll() / peek() but throw exceptions on empty instead of returning null.
 */