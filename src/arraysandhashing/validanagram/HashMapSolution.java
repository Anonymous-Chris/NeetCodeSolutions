package arraysandhashing.validanagram;

import java.util.HashMap;

public class HashMapSolution {
    public static void main(String[] args) {
        String item1 = "racecar";
        String item2 = "carrace";
        String item3 = "jar";
        String item4 = "jam";

        boolean result1 = isAnagram(item1, item2);
        boolean result2 = isAnagram(item3, item4);
    }

    public static boolean isAnagram(String item1, String item2) {
        if(item1.length() != item2.length()){
            return false;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c: item1.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        for (char c: item2.toCharArray()){
            if(!hashMap.containsKey(c)){
                return false;
            }
            hashMap.put(c,hashMap.get(c)-1);
            if(hashMap.get(c)==0){
                hashMap.remove(c);
            }
        }
        return hashMap.isEmpty();
    }
}
//TC: O(n)
//Sc: O(n)