package permutations;

import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations {

    /*
            Given a collection of distinct integers, return all possible permutations.

        Example:

        Input: [1,2,3]
        Output:
        [
          [1,2,3],
          [1,3,2],
          [2,1,3],
          [2,3,1],
          [3,1,2],
          [3,2,1]
        ]

        Input: [1,2,3, 4, 5]
        Output:
        [
          [1,2,3,4],
          [1,2,4,3],
          [1,3,4,2],
          [1,3,2,4],
          [1,4,2,3],
       ...
        ]

    * */

    public List<List<Integer>> permute(int [] nums){

        List<List<Integer>> output = new ArrayList<>();

        if(nums == null|| nums.length ==0){
            return output;
        }
        List<Integer> current = new ArrayList<>();

        generate(output, nums);
        return output;
    }

    public void generate(List<List<Integer>> output, int[] nums){


    }
}
