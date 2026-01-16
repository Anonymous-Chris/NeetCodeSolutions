package arrays.reversestring;

import arrays.print.PrintArray;

public class BruteForceSolution {
    public static void main(String[] args) {
        String [] arr = {"n","e","e","t"};
        PrintArray.printArray(reverseString(arr));
        String [] arr1 = {"r","a","c","e","c","a","r"};
        PrintArray.printArray(reverseString(arr1));

    }
    public static String [] reverseString(String[] s) {
        String [] newArray = new String[s.length];
        for(int i =s.length-1 ;i>=0;i--){
            newArray[s.length-i-1] = s[i];
        }
        return newArray;
    }
}
//TC: O(n)
//SC:O(n) - new array is created
//If able to modify original array, it will be in O(1)
