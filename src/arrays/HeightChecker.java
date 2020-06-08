package arrays;

import java.util.Arrays;

public class HeightChecker {



    public int heightChecker(int[] heights) {

        int lastIndex = heights.length-1;
        int swapCount = 0;

        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);

        for(int i =0; i< heights.length; i++){
            if(heights[i] != sortedHeights[i]){
                swapCount++;
            }
        }
        return swapCount;
    }



}
