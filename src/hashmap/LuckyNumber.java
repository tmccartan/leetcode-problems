package hashmap;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {

        int [] test1 = new int[] {2,2,3,4};
        int result = findLucky(test1);
        System.out.println(result); //2

        int [] test2 = new int[] {1,2,2,3,3,3};
        int result2 = findLucky(test2);
        System.out.println(result2); //3

        int [] test3 = new int[] {2,2,2,3,3};
        int result3 = findLucky(test3);
        System.out.println(result3); //-1
    }

    public static int findLucky(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i: arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int maxSoFar = -1;

        for(int i: arr){
            if(freq.get(i) == i){
                maxSoFar = Math.max(maxSoFar, freq.get(i));
            }
        }
        return maxSoFar;

    }
}
