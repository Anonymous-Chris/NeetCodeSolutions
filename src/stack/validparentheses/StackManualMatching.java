package stack.validparentheses;

import print.PrintItem;

import java.util.Stack;

public class StackManualMatching {
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
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
        }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
//SC: O(n)
//TC: O(n)