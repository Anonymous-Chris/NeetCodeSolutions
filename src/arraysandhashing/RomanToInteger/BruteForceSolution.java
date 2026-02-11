package arraysandhashing.RomanToInteger;

public class BruteForceSolution {

    static void main(String[] args) {
        String s  = "III";
        int result = romanToInt(s);
        System.out.println(result);
        String s1 = "LVIII";
        int result1 = romanToInt(s1);
        System.out.println(result1);
        String s2 = "MCMXCIV";
        int result2 = romanToInt(s2);
        System.out.println(result2);
    }
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                result += 1;
            } else if (c == 'V') {
                result += 5;
            } else if (c == 'X') {
                result += 10;
            } else if (c == 'L') {
                result += 50;
            } else if (c == 'C') {
                result += 100;
            } else if (c == 'D') {
                result += 500;
            } else if (c == 'M') {
                result += 1000;
            }
        }
        //handle the cases where a smaller value is before a larger value
        if(s.contains("IV")){
            result = result -2;
        }
        if(s.contains("IX")){
            result = result -2;
        }
        if(s.contains("XL")){
            result = result -20;
        }
        if(s.contains("XC")){
            result = result -20;
        }
        if(s.contains("CD")){
            result = result -200;
        }
        if(s.contains("CM")){
            result = result -200;
        }
        return result;
    }
    }
//Time complexity: O(n) where n is the length of the input string s. We iterate through the string once to calculate the initial result, and then we check for specific substrings which also takes O(n) time in the worst case.
//Space complexity: O(1) since we are using a constant amount of space to store the result and the intermediate variables.