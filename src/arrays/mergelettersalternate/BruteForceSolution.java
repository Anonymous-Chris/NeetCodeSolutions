package arrays.mergelettersalternate;

import arrays.print.PrintItem;

public class BruteForceSolution {
    public static void main(String[] args) {
        //can it be a palindrome after removing one character
        String s = "chris";
        String s1 = "limbe";
        String s2 = "engineer";
        PrintItem.print(mergeAlternately(s,s1));
        PrintItem.print(mergeAlternately(s1,s2));
        PrintItem.print(mergeAlternately(s2,s));
    }
    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int i =0;
        int j = 0;
        while (i<word1.length() && j<word2.length()){
            result += word1.charAt(i);
            result+=word2.charAt(j);
            i++;
            j++;
        }
        //append remaining characters
        while (i<word1.length()){
            result+=word1.charAt(i);
            i++;
        }
        while (j<word2.length()){
            result+=word2.charAt(j);
            j++;
        }
        return result;
    }
}
//Time: O(n + m)2 → each character is visited once
//Space: O(1) extra if building with + operator but in Java + creates new string each time → O(n+m)
/*
🔹 Time Complexity
	•	Appending a character to a String with + in Java: O(k) where k = current string length
(Because strings are immutable → every + creates a new string by copying old characters)
	•	First iteration → append 1st char → O(1)
	•	Second iteration → append 2nd char → O(2)
	•	Third iteration → append 3rd char → O(3)
	•	Total = 1 + 2 + 3 + … + (n + m) ≈ O((n + m)²)

✅ TC: O((n + m)²) → bad for larger strings
🔹 Space Complexity
	•	Every + creates a new string of size up to n+m
	•	So SC = O(n + m) → for final string
 */