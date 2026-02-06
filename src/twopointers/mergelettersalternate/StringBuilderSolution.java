package twopointers.mergelettersalternate;

import print.PrintItem;

public class StringBuilderSolution {
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
    StringBuilder stringBuilder = new StringBuilder();
    int i =0;
    int j=0;
    while (i < word1.length() && j < word2.length()) {
            stringBuilder.append(word1.charAt(i++));
            stringBuilder.append(word2.charAt(j++));
        }
            // append remaining
            if (i < word1.length()) {
                stringBuilder.append(word1.substring(i));
            }
            if (j < word2.length()) {
                stringBuilder.append(word2.substring(j));
            }

            return stringBuilder.toString();
    }
    }
//TC:O(m+n)
//SC:O(m+n)
/*
🔹 Time Complexity
	•	StringBuilder.append() → O(1) per character
	•	Loop visits each character exactly once
	•	Appending leftover substring → O(n - i) or O(m - j) → still linear

✅ TC: O(n + m) → optimal
🔹 Space Complexity
	•	Only one StringBuilder is used
	•	Final string will hold n + m characters

✅ SC: O(n + m)
 */