package logicbuilding.easy.paircubecount;

public class BruteForceSolution {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(pairCubeCount(n));
        int n1 = 28;
        System.out.println(pairCubeCount(n1));
    }

    public static int pairCubeCount(int n) {
        int count = 0;
        for(int i = 1 ;i<=n;i++){
            for (int j =0; j<=n;j++){
                if((i*i*i) + (j*j*j) == n){
                    count++;
                }
            }
        }
        return count;
    }
}
//TC: O(n^2) - The nested loops iterate through all pairs of integers from 0 to n, resulting in n * n iterations.
//SC: O(1) - The space complexity is constant as we are using only a fixed amount of space to store the count variable, regardless of the input size.