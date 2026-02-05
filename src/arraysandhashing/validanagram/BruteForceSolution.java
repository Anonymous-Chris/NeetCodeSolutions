package arraysandhashing.validanagram;

import java.util.Arrays;

public class BruteForceSolution {
    public static void main(String[] args) {
        String item1 = "racecar";
        String item2 = "carrace";
        String item3 = "jar";
        String item4 = "jam";

        boolean result1 = isAnagram(item1, item2);
        boolean result2 = isAnagram(item3, item4);
    }

    public static boolean isAnagram(String item1, String item2) {
        if(item1.length() != item2.length()){
            return false;
        }
        char [] first = item1.toCharArray();
        char [] second = item2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }
}
//TC: O(nlogn) as sorting is nlogn
//SC: O(n) as size of array is n