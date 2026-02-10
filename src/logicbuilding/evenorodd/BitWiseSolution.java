package logicbuilding.evenorodd;

public class BitWiseSolution {
    static void main(String[] args) {
        int num = 5;
        if(isBoolean(num)){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
    public static  boolean isBoolean(int num){
        // If the least significant bit is 0, then the number is even; otherwise, it's odd.
        // This is because even numbers have a binary representation that ends with 0, while odd numbers end with 1.
        // For example:
        // 4 in binary is 100 (even, ends with 0)
        // 5 in binary is 101 (odd, ends with 1)
        if((num & 1) == 0){
            return true;
        }
        return false;
    }
}
//TC: O(1) - The bitwise operation takes constant time.
//SC: O(1) - No additional space is used.