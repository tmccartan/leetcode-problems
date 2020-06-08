package sorting;

public class SearchRange {


    /*
    Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

    Your algorithm's runtime complexity must be in the order of O(log n).

    If the target is not found in the array, return [-1, -1].

    Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:

    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]

    * */
    public int[] searchRange(int[] nums, int target) {

        // find the left most index
        // find the right most index

        int [] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        int leftIndex = search(nums, target, true);

        if(leftIndex == nums.length || nums[leftIndex] != target){
            return result;
        }

        result[0] = leftIndex;
        result[1] = search(nums, target, false) - 1;

        return result;


    }

    public int search(int [] nums, int target, boolean left){


        int lo = 0;
        int hi = nums.length;

        while(lo < hi){
            int mid = (hi+lo) /2;
            if(nums[mid] > target || left && nums[mid] == target){
                hi = mid;
            }
            else{
                lo = mid +1;
            }
        }
        return lo;
    }

}
