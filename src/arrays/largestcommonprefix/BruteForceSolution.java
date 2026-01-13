package arrays.largestcommonprefix;

public class BruteForceSolution {
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
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<array[0].length();i++){
            char c = array[i].charAt(i);
            for(int j =1; j<array.length;j++){
                if(i>array[j].length() || array[j].charAt(i)!=c){
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
    //TC: O(n*k), n = no of strings, k = length of shortest string
    //SC: O(1)
}
