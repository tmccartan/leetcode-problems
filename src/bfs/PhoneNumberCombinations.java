package bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> output= new ArrayList<String>();

        if(digits ==null ||digits.length() ==0){
            return output;
        }

        Map<String, String> map = new HashMap<>();

        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        char[] character = digits.toCharArray();
        backtrace("", digits , map, output);
        return output;


    }

    public void backtrace(String combination, String digit, Map<String, String> map, List<String> output){
        if(digit.length() == 0){
            output.add(combination);
        } else {
            String nextDigit = digit.substring(0, 1);
            String letters = map.get(nextDigit);

            for(int i= 0; i < letters.length(); i++){
                backtrace(combination + letters.charAt(i), digit.substring(1), map, output);
            }

        }
    }

}
