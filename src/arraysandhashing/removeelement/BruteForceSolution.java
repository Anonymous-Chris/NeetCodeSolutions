package arraysandhashing.removeelement;

public class BruteForceSolution {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
        int [] nums1 = {1,1,2,3,4};
        int val1 = 1;
        System.out.println(removeElement(nums1,val1));
    }
    public static int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp[k] = nums[i];
                k++;
            }
        }
        //copy back to nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        return k;
    }
}
//When val is found, shift all elements to the left
//Reduce array size logically