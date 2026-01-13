package arrays.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteForceSolution {
    public static void main(String[] args) {
        String [] array = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(array));
    }

    public static List<List<String>> groupAnagrams(String[] array) {
        List<List<String>> groups = new ArrayList<>();
        for(String arr: array){
            boolean added = false;
            // Compare with all existing groups
            for(List<String> group : groups){
                if(isAnagram(arr, group.get(0))){
                    group.add(arr);
                    added = true;
                    break;
                }
            }

            if(!added){
                // Create new group
                List<String> newGroup = new ArrayList<>();
                newGroup.add(arr);
                groups.add(newGroup);
            }
        }
        return groups;
    }

    private static boolean isAnagram(String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        char [] firstArray = first.toCharArray();
        char [] secondArray = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray,secondArray);
    }
}
//TC: O(n^2 * klogk) i.e. two loops and sorting using Arrays.sort(a,b)
//SC: O(n*k)