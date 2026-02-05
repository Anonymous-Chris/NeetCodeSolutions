package stack.validparentheses;

import print.PrintItem;

public class BruteForceSolution {
    static void main(String[] args) {
        String s = "()[]{}";
        String s1 = "(]";
        String s2 = "([)]";
        String s3 = "{[]}";
        PrintItem.print(isValid(s));
        PrintItem.print(isValid(s1));
        PrintItem.print(isValid(s2));
        PrintItem.print(isValid(s3));
    }
    public static boolean isValid(String s) {
        if (s == null || s.length() %2 !=0) {
            return false;
        }
        int previousLength;
        do{
            previousLength = s.length();
            s = s.replace("()", " ").replace("{}", "").replace("[]", "");
        }while (s.length()!=previousLength);
        return s.length() == 0;
    }
}
//TC: O(n^2) in worst case. Replace is O(n) in java
//SC: O(n) (new strings created)