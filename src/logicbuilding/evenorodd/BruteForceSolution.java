package logicbuilding.evenorodd;

public class BruteForceSolution {
    static void main(String[] args) {
        int num = 5;
        if(isBoolean(num)){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
    public static  boolean isBoolean(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
//TC: O(1) - The modulus operation takes constant time.
//SC: O(1) - No additional space is used.