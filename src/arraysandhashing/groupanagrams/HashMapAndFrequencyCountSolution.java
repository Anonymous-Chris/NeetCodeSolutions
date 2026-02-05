package arraysandhashing.groupanagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapAndFrequencyCountSolution {
    public static void main(String[] args) {
        String [] array = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(array));
    }

    public static List<List<String>> groupAnagrams(String[] array) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
            for(String s: array){
                int [] freq = new int [26];
                //in java 'c' - 'a' = 2 i.e. ASCII values
                for (int i = 0; i < s.length(); i++) {
                    freq[s.charAt(i) - 'a']++;
                }

                String key = buildKey(freq);
                if(!hashMap.containsKey(key)){
                    hashMap.put(key, new ArrayList<>());
                }
                hashMap.get(key).add(s);
            }
            return new ArrayList<>(hashMap.values());
        }

        private static String buildKey(int [] freqArray){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i =0; i<freqArray.length; i++){
                stringBuilder.append(freqArray[i]).append('#');
            }
            return stringBuilder.toString();
        }
    }
//# is used to prevent ambiguity
//[1,11] → "1#11#"
//[11,1] → "11#1#"
//TC: O(n*k) i.e. n = no of strings, k=average string length
//SC: O(n*k)