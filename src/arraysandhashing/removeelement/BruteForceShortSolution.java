package arraysandhashing.removeelement;

public class BruteForceShortSolution {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
        int [] nums1 = {1,1,2,3,4};
        int val1 = 1;
        System.out.println(removeElement(nums1,val1));
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int n : nums){
            if(n != val){
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
//When val is found, shift all elements to the left
//Reduce array size logically
//TC: O(n)
//SC: O(1)