package twopointers.validpalindrome;

import print.PrintItem;

public class BruteForceSolution {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";
        PrintItem.print(isPalindrome(s));
        String s1 = "tab a cat";
        PrintItem.print(isPalindrome(s1));
    }
    //use stringbuilder
    public static boolean isPalindrome(String s) {
        String trimmed = s.replaceAll(" ", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i<trimmed.length();i++){
            stringBuilder.append(trimmed.charAt(trimmed.length()-i-1));
        }
        return trimmed.equals(stringBuilder.toString());
    }
    /*
    public static boolean isPalindrome(String s) {
        String trimmed = s.replaceAll(" ", "").toLowerCase();
        String cleaned = "";
        for(int i =0; i<trimmed.length();i++){
            cleaned+= trimmed.charAt(trimmed.length()-i-1);
        }
        return trimmed.equals(cleaned);
    }
     */
}
//TC: O(n)
//SC: O(n)
//Strings are immutable in java. so it creates a new string every time.
//So, use stringbuilder