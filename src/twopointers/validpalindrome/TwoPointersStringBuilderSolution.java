package twopointers.validpalindrome;

import print.PrintItem;

public class TwoPointersStringBuilderSolution {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";
        PrintItem.print(isPalindrome(s));
        String s1 = "tab a cat";
        PrintItem.print(isPalindrome(s1));
    }
    //use stringbuilder
    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right = stringBuilder.length()-1;
        while(left<right){
            if(stringBuilder.charAt(left) != stringBuilder.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }
//TC: O(n)
//SC: O(n) due to string builder