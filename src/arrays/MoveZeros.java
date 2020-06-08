package arrays;

public class MoveZeros {

    /*
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Example:

    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

    * */
    public void moveZeroes(int[] nums) {

        int lastNonZero = 0;

        //loop over all of num and move items that are not zero forward in the array
        //by only incrementing lastNonZero when we see a non null

        for(int i =0; i< nums.length; i++){
            if(nums[i] != 0){
                nums[lastNonZero]= nums[i];
                lastNonZero ++;
            }
        }
        // finish off by setting everything from the last non zero
        // to 0
        for(int i=lastNonZero; i<nums.length;i++){
            nums[i]=0;
        }
    }


}
