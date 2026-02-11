package logicbuilding.basic.sumofsquaresofnnumbers;

public class RecursionSolution {
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(sumofSquares(n));
    }

    static int sumofSquares(int n){
        if(n==1){
            return 1;
        }
        return n*n + sumofSquares(n-1);
    }
}
