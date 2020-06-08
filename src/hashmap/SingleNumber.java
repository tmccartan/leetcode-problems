package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int[] test1 = new int[]{2,2,1};
        int result = singleNumber(test1); // 1
        System.out.println(result); // 1


        int[] test2 = new int[]{4,1,2,1,2};
        int result2 = singleNumber(test2); // 4
        System.out.println(result2); // 4
    }

  /*

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

  */

    public static int singleNumber(int[] nums) {

        // loop each num to get its frequency,

        // loop again and find first freq with 1

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i: nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int foundNum =-1;

        for(int i: nums){

            if(freq.get(i) == 1){
                foundNum= i;
                break;
            }
        }

        return foundNum;
    }
}
