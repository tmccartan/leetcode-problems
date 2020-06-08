package strings;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsString {

    /*
    *
    * Write a function that takes a string as input and reverse only the vowels of a string.
    * Runtime O(n), Space O(n)

        Example 1:

        Input: "hello"
        Output: "holle"
        Example 2:

        Input: "leetcode"
        Output: "leotcede"
        Note:
        The vowels does not include the letter "y".
    *
    * */

    public String reverseVowels(String s) {

        char [] characters = s.toCharArray();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');


        int i = 0;
        int j = s.length() - 1;
        while(i<j){

            // find the first i that is a vowel;
            // find the first j that is a vowel;
            // swap the i and j characters
            // increment i , decrement j

            while(i < j  && !vowels.contains(s.charAt(i))){
                i++;
            }
            while(i < j && !vowels.contains(s.charAt(j))){
                j--;
            }

            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i++;
            j--;
        }

        return new String(characters);
    }
}
