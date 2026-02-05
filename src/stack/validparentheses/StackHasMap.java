package stack.validparentheses;

import print.PrintItem;

import java.util.HashMap;
import java.util.Stack;

public class StackHasMap {
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
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(hashMap.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != hashMap.get(c)){
                    return false;
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }
}
//TC: O(n)
//SC: O(n)