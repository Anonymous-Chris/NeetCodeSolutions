package arraysandhashing.mergelettersalternate;

import arraysandhashing.print.PrintItem;

public class StringBuilderOneLoopSolution {
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
        int m =word1.length();
        int n =word2.length();
        int maxlen = Math.max(m,n);

        for (int i=0; i<maxlen;i++){
            if(i<m){
                stringBuilder.append(word1.charAt(i));
            }
            if(i<n){
                stringBuilder.append(word2.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
//TC:O(m+n)
//SC:O(m+n)
/*
🔹 Time Complexity
	•	Loop runs max(n, m) ≤ n + m times
	•	Each iteration appends 1 or 2 characters → O(1) per append
	•	Total time = O(n + m)
🔹 Space Complexity
	•	StringBuilder stores merged string → O(n + m)
	•	No extra space is created inside the loop

✅ SC: O(n + m)
 */
