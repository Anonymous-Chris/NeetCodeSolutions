package mathandgeometry.romantointeger;

import arrays.print.PrintItem;

import java.util.HashMap;

public class BruteForceSolution {
    static void main(String[] args) {
        String val = "III";
        PrintItem.print(romanToInt(val));
        String val1 = "XLIX";
        PrintItem.print(romanToInt(val1));
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int sum = 0;
        for(int i=0; i<s.length();i++){
            int current = hashMap.get(s.charAt(i));
            int next = (i+1<s.length()) ? hashMap.get(s.charAt(i+1)) : 0;

            if(current<next){
                sum = sum -current;
            }else{
                sum = sum + current;
            }
        }
        return sum;
    }
}
/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

TC: O(n)
SC: O(1) since it is hashmap lookup
 */