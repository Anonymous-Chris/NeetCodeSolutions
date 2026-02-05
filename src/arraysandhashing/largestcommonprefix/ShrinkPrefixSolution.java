package arraysandhashing.largestcommonprefix;

public class ShrinkPrefixSolution {
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
        String str = array[0];
        for (int i =1; i< array.length;i++){
            while(!array[i].startsWith(str)){
                str = str.substring(0, str.length()-1);
                if(str.isEmpty()){
                    return "";
                }
            }
        }
        return str;
        }
    }
//TC: O(n*k), n = no of strings, k = length of shortest string
//SC: O(1)
