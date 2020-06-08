package searching;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        if(nums.length == 0){
            return -1;
        } else if(nums.length == 1){
            return nums[0] == target ? 0 : -1;
        }
        int pivot = findPivot(nums, 0, nums.length -1);
        System.out.println(pivot);
        if(pivot == -1){
            return search(nums, 0, nums.length -1, target);
        }

        if(nums[pivot] == target){
            return pivot;
        } else if(nums[0] <= target){
            return search(nums, 0, pivot-1, target);
        } else{
            return search(nums, pivot+1, nums.length -1, target);
        }

        /// find the element that the array was rotated around
        // if the pivot element is less than the target look to the right
        // if the pivot element is greater than the targe look to the left


    }

    public int findPivot(int[] nums, int low, int high){

        if(high<low){
            return -1;
        } else if(high == low){
            return low;
        }

        int mid = (high + low) / 2;

        if(mid < high && nums[mid] > nums[mid + 1]){
            return mid;
        } else if(mid > low && nums[mid] < nums[mid-1]){
            return (mid -1);
        } else if(nums[low] >= nums[mid]){
            return findPivot(nums, low, mid-1);
        } else{
            return findPivot(nums, mid+1, high);
        }


    }

    public int search(int[] nums, int low, int high, int target){

        if(high<low){
            return -1;
        }

        int mid = (high+ low)/2;
        if(nums[mid] == target){
            return mid;
        } else if( target > nums[mid]){
            return search(nums, mid+1, high, target);

        } else {
            return search(nums, low,  mid-1, target);
        }

    }
}
