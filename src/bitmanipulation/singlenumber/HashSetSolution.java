package bitmanipulation.singlenumber;

import arraysandhashing.print.PrintItem;

import java.util.HashSet;

public class HashSetSolution {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        PrintItem.print(singleNumber(nums));
        int [] nums1 = {7,6,6,7,8};
        PrintItem.print(singleNumber(nums1));
    }
    public static int singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num: nums){
            boolean added = hashSet.add(num);
            //hashset only adds one element
            if(added == false){
                hashSet.remove(num);
            }
        }
        return hashSet.iterator().next();
    }
    }
//TC: O(n)
//SC: O(n)