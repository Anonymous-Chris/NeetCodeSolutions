package arraysandhashing.RomanToInteger;

import java.util.HashMap;

public class HashMapSolution {
    static void main(String[] args) {
        String s  = "III";
        int result = romanToInt(s);
        System.out.println(result);
        String s1 = "LVIII";
        int result1 = romanToInt(s1);
        System.out.println(result1);
        String s2 = "MCMXCIV";
        int result2 = romanToInt(s2);
        System.out.println(result2);
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the current character is less than the next character, we need to subtract its value from the result. Otherwise, we add its value to the result.
            //index starts at 0 and ends at s.length()-1, so we need to check if i is less than s.length()-1 before accessing the next character to avoid an IndexOutOfBoundsException.
            if(i<s.length()-1 && hashMap.get(c) < hashMap.get(s.charAt(i+1))){
                result = result - hashMap.get(c);
            } else {
                result = result + hashMap.get(c);
            }
        }
        return result;
    }
}
//Time complexity: O(n) where n is the length of the input string s. We iterate through the string once to calculate the result.
//Space complexity: O(1) since we are using a constant amount of space to store the result and the HashMap, which contains a fixed number of key-value pairs (7 in this case).
