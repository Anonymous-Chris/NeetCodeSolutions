package arrays.reversestring;

import arrays.printarray.PrintArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseusingcollections {
    public static void main(String[] args) {
        String [] arr = {"n","e","e","t"};
        PrintArray.printArray(reverseString(arr));
        String [] arr1 = {"r","a","c","e","c","a","r"};
        PrintArray.printArray(reverseString(arr1));

    }
    public static String [] reverseString(String[] s) {
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        String[] reversedArray = list.toArray(new String[0]);
        return reversedArray;
    }
    }
