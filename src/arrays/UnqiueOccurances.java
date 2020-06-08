package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UnqiueOccurances {

    public static void main(String[] args) {

        int [] test1 = new int[]{1,2,2,1,1,3};

        boolean result = uniqueOccurrences(test1);

        System.out.println(result); //true

        int [] test2 = new int[]{1,2,2,1,1,3};

        boolean result2 = uniqueOccurrences(test1);

        System.out.println(result2); //true

    }


    public static boolean uniqueOccurrences(int[] arr) {
     /*
     Given an array of integers arr, write a function that returns true if and only if the number of  occurrences of each value in the array is unique.
     */

        // build a freq map
        // build a number of freq map

        Map<Integer, Integer> freqMap = new HashMap<>();
        Set<Integer> seenFreq = new HashSet<>();

        for(int i: arr){
            freqMap.put(i, freqMap.getOrDefault(i, 0) +1);
        }
        System.out.println(freqMap);
        for(int i: freqMap.keySet()){
            if(seenFreq.contains(freqMap.get(i))){
                return false;
            }
            seenFreq.add(freqMap.get(i));
        }
        return true;
    }

}
