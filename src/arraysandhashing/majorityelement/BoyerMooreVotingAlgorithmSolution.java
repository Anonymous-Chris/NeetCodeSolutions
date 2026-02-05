package arraysandhashing.majorityelement;

public class BoyerMooreVotingAlgorithmSolution {
    public static void main(String[] args) {
        int [] nums = {5,5,1,1,1,5,5};
        System.out.println(majorityElement(nums));
        int [] nums1 = {2,2,2};
        System.out.println(majorityElement(nums1));
    }
    public static int majorityElement(int[] nums) {
        int majority  = 0;
        int count = 0;
        for (int num: nums){
            if(count == 0){
                majority = num;
            }
            if(num == majority){
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }

    }
//TC: O(n)
//SC: O(1)
//Idea: Since it has a solution 100%, If two different elements appear, they cancel each other out
//The majority element survives all cancellations
