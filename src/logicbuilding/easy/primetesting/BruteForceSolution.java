package logicbuilding.easy.primetesting;

public class BruteForceSolution {
    public static void main(String[] args) {
        int n = 29;
        if(isPrime(n)){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }
    }

    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i =2; i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
//TC: O(n) - In the worst case, we check all numbers from 2 to n-1 to determine if n is prime.
//SC: O(1) - We use a constant amount of space to store the input number and the loop variable.