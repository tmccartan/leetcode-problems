package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReoccuringDNA {

    /*
    https://leetcode.com/problems/repeated-dna-sequences/
    All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

    Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

    Example:

    Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"

    Output: ["AAAAACCCCC", "CCCCCAAAAA"]
    *
     */
    public List<String> findRepeatedDnaSequences(String s) {
        // build up hashmap of repeating substrings.
        // build loop taking a substring of i -> i + 10
        // each time check if the substring exists
        // if it does increment its count.
        // if it occurs more than 1 add it to the result set

        List<String> reoccurring = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int i = 0;
        while(i + 10 <= s.length()){
            String sequence = s.substring(i, i + 10);
            i++;
            map.put(sequence, map.getOrDefault(sequence,0) + 1);

            if(map.get(sequence) == 2){
                reoccurring.add(sequence);
            }
        }
        return reoccurring;
    }


}
