package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        TwoSum s = new TwoSum();

        int[] nums = new int[]{ 2, 7, 11, 15};
        int target = 9;

        int [] output = s.validate(nums, target);

        System.out.println(Arrays.toString(output));


    }

    public int[] validate(int [] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int [] indices = new int[2];

        for(int i =0; i < nums.length; i++){
            int component = target - nums[i];

            if(map.containsKey(component)){
                indices[0] = map.get(component);
                indices[1] = i;
            }
            map.put(nums[i], i);

        }
        return indices;
    }
}
