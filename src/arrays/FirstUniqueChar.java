package arrays;

import java.util.HashMap;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        // loop over string
        // If exists in hashmap, skip
        // If not exists but it in the hashmap with the index

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] characters = s.toCharArray();
        for(int i=0; i<characters.length; i++){
            map.put(characters[i], map.getOrDefault(characters[i],0)+1);
        }
        for (int j=0; j<characters.length; j++){
            if(map.get(characters[j]) ==1){
                return s.indexOf(characters[j]);
            }
        }
        return -1;
    }

    public static void main(String[] args){

        String input1 = "leetcode";
        Integer res = firstUniqChar(input1);
        System.out.println(res);


        String input2 = "loveleetcode";
        Integer res2 = firstUniqChar(input2);
        System.out.println(res2);
    }
}
