package pointers.validpalindrometwo;

import arraysandhashing.print.PrintItem;

public class TwoPointerSolution {
    public static void main(String[] args) {
        //can it be a palindrome after removing one character
        String s = "abbda";
        PrintItem.print(validPalindrome(s));
        String s1 = "abbac";
        PrintItem.print(validPalindrome(s1));
        String s2 = "abqda";
        PrintItem.print(validPalindrome(s2));
    }
    public static  boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                //Try skipping left or right character
                return isPalindrome(s,left+1, right) || isPalindrome(s, left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    //Find Palindrome for a range
    public static boolean isPalindrome(String s, int left, int right){
        while (left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }
/*
Two Pointer + One Deletion Check (Optimal)
Use two pointers
	•	On first mismatch:
	•	Either skip left character
	•	OR skip right character
	•	Only one deletion allowed

Once a mismatch occurs:
•	You only get one chance
•	Check both possibilities
•	If either forms a palindrome → true
 */
//TC: O(n)
//SC: O(1)
//While(left<right) is an O(n) and it can only have one mismatch.
//So, the TC is O(n)