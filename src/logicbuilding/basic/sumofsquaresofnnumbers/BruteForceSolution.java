package logicbuilding.basic.sumofsquaresofnnumbers;

public class BruteForceSolution {
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(sumofSquares(n));
    }

    static int sumofSquares(int n){
        int sum = 0;
        for(int i=0; i<n;i++){
            sum = sum + (i+1)*(i+1);
        }
        return sum;
    }
}
//TC: O(n) - We iterate from 1 to n to calculate the sum of squares of the first n natural numbers.
//SC: O(1) - We are using a constant amount of space to store the