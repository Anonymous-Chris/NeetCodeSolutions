package pointers.validpalindrometwo;

import arrays.print.PrintItem;

public class BruteForceSolution {
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
        if(isPalindrome(s)){
            return true;
        }
        //Try deleting each character
        for(int i =0; i< s.length();i++){
            String modified = s.substring(0,i) + s.substring(i+1);
            if(isPalindrome(modified)){
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String str){
        int left =0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/*
String s = "abcdef";
System.out.println(s.substring(2));
cdef
System.out.println(s.substring(1, 4));
bcd
 */
//TC: O(n2) //for loop and another loop in ispalindrome check
//SC: O(n)