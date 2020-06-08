package arrays;

public class MaxSubArray {

    /*
    *
    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    Example:

    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
    Follow up:

    If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

    * */

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i < nums.length; i++){
            int currentNum = nums[i];

            if(sum < 0){
                sum = currentNum;
            }
            else {
                sum += currentNum;


            }
            if(sum > max){
                max = sum;
            }

        }
        return max;
    }

}
