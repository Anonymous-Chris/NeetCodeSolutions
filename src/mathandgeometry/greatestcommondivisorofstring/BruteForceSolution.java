package mathandgeometry.greatestcommondivisorofstring;

import print.PrintItem;

public class BruteForceSolution {
    public static void main(String[] args) {
        String str1 = "ABAB", str2 = "AB";
        String str3 = "NANANA", str4 = "NANA";
        PrintItem.print(gcdOfStrings(str1,str2));
        PrintItem.print(gcdOfStrings(str3,str4));
    }
    public static String gcdOfStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        String result = "";
        //Try every prefix length
        for(int len=1; len<=minLength;len++){
            // Candidate divisor string
            String candidate = str1.substring(0,len);
            // Check if candidate divides both strings
            if(isDivisor(str1,candidate) && isDivisor(str2, candidate)) {
                // keep largest valid one
                result = candidate;
            }
        }
        return result;
    }

    public static boolean isDivisor(String s, String pattern){
        int len = pattern.length();
        //length must be divisible
        if(s.length()% len!=0){
            return false;
        }

        //check each chunk
        for(int i=0;i<s.length();i+=len){
            if(!s.substring(i,i+len).equals(pattern)){
                return false;
            }
        }
        return true;
    }
}
/*
Time Complexity
    Trying all prefixes → O(n)
    Checking each prefix → O(n)
Total → O(n²)
SC: O(1) (Only variables used, no extra data structures.)
 */