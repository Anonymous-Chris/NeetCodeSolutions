package arraysandhashing.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapAndSortingSolution {
    public static void main(String[] args) {
        String [] array = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(array));
    }

    public static List<List<String>> groupAnagrams(String[] array) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(String arr: array){
            char [] charArray = arr.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            //check if key already exists
            if(!hashMap.containsKey(key)){
                hashMap.put(key, new ArrayList<>());
            }
            // Add the string to the list for this key
            hashMap.get(key).add(arr);
        }
        return new ArrayList<>(hashMap.values());
    }
}
//TC: O(n * klogk) i.e. one loop and sorting using Arrays.sort(a,b)
//SC: O(n*k) i.e. HashMap stores all strings (and keys of length k)