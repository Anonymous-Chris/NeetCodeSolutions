package arrays.largestcommonprefix;

import java.util.Arrays;

public class SortingAndComparingSolution {
    public static void main(String[] args) {
        String [] array = {"bat","bag","bank","band"};
        System.out.println(longestCommonPrefix(array));
        String [] array1 = {"dance","dag","danger","damage"};
        System.out.println(longestCommonPrefix(array1));
        String [] array2 = {"neet", "feet"};
        System.out.println(longestCommonPrefix(array2));
    }
    public static String longestCommonPrefix(String[] array) {
        if(array == null || array.length == 0){
            return "";
        }
        Arrays.sort(array);
        String first = array[0];
        String last = array[array.length-1];
        int i =0;
        while(i<first.length() && i<last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
        }
    }
//TC: O(nlogn) i.e. sorting is logn
//SC: O(1)