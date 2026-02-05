package pointers.validpalindrome;

import print.PrintItem;

public class TwoPointersNoExtraSpaceSolution {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";
        PrintItem.print(isPalindrome(s));
        String s1 = "tab a cat";
        PrintItem.print(isPalindrome(s1));
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            // Skip non-alphanumeric on left
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // Skip non-alphanumeric on right
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            // Compare characters
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }
