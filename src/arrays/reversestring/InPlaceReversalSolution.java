package arrays.reversestring;

import arrays.print.PrintArray;

public class InPlaceReversalSolution {
    public static void main(String[] args) {
        String [] arr = {"n","e","e","t"};
        PrintArray.printArray(reverseString(arr));
        String [] arr1 = {"r","a","c","e","c","a","r"};
        PrintArray.printArray(reverseString(arr1));

    }
    public static String [] reverseString(String[] s) {
        int left =0;
        int right = s.length - 1;
        while(left< right){
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
    }
//Time: O(n) — still must visit each element.
//Space: O(1) — no extra array created.
//Pros: Memory-efficient.
//Cons: Modifies original array.