package arrays;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {

        int lastIndex = 0;
        for(int i =1; i< nums.length; i++){
            if(nums[i] != nums[lastIndex] ){
                lastIndex ++;
                nums[lastIndex] = nums[i];
            }
        }
        return lastIndex+1;
    }

    public static void main(String [] args){

        int [] nums = new int[]{1,1,2};

        int result = removeDuplicates(nums);

        System.out.println(result);
        assert(result == 2);
    }
}
