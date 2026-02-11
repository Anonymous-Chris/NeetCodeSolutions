package logicbuilding.easy.primetesting;

public class OptimizedSolution {
    public static void main(String[] args) {
        int n = 29;
        if(isPrime(n)){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // We only need to check for factors up to the square root of n. If n is divisible by any number greater than its square root, it must have a corresponding factor that is less than the square root.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//TC: O(sqrt(n)) - In the worst case, we check for factors up to the square root of n.
//SC: O(1) - We use a constant amount of space to store the input number and the loop variable.