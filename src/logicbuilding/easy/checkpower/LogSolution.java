package logicbuilding.easy.checkpower;

public class LogSolution {
    public static void main(String[] args) {
        System.out.println(isPowerOf(1, 10));
        System.out.println(isPowerOf(20,1));
        System.out.println(isPowerOf(128,2));
        System.out.println(isPowerOf(30,2));
        System.out.println(isPowerOf(1, 1));

    }

    public static boolean isPowerOf(int n, int k) {
        if(n <= 0 || k <=0){
            return false;
        }else if(k==1){
            return true;
        }
        double result = Math.log(n) / Math.log(k);
        return result == Math.floor(result);
    }
}
//TC: O(1) - The logarithmic calculations and comparisons take constant time.
//SC: O(1) - No additional space is used.