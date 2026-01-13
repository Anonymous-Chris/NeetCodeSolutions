package arrays.concatenationarray;

public class BruteForceSolution {
    public static void main(String[] args) {
        int [] nums = {1,4,1,2};
        System.out.println(getConcatenation(nums));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] result = new int [n*2];
        for(int i =0; i<n ; i++){
            result[i] = nums[i];
            result[i+n] = nums[i];
        }
        return result;
    }
}
//TC: O(n)
//SC: O(n)