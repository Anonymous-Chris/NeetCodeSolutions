package logicbuilding.easy.checkpower;

public class BruteForceSolution {
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
        int power = 1; // Start with k^0
        while(power < n) {
            power *= k; // Multiply by k to get the next power
        }
        return power == n; // Check if we found n as a power of k
    }
}
//TC: O(log n) - In the worst case, we will multiply k until we reach or exceed n, which takes logarithmic time relative to n.
//SC: O(1) - We are using a constant amount of space to store the variable 'power'.
