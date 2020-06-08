package strings;

import java.util.*;

public class ReverseWordsInStringWithPunctuation {


    public static void main(String[] args){

        String s = "hello, world!";

        String outcome = reverseWords(s);

        String s2 = "May the Fourth, be with you";
        String outcome2 = reverseWords(s2);

        String s3 = "What? How? When!";
        String outcome3 = reverseWords(s3);

        StringBuilder sb = new StringBuilder();

        String str2 = sb.reverse().toString();
        System.out.println(outcome);
        System.out.println(outcome2);
        System.out.println(outcome3);
    }

    public static String reverseWords(String s) {

        // loop over the string
        // find the index of a punctuation
        // find the word index it needs to be added to and its index;
        // break string into words.
        // loop over words and append punctuation when index matches;
        HashMap<Integer, Character> maps = new HashMap<>();
        int wordCount = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == ' '){
                wordCount++;
            } else if(!Character.isLetter(s.charAt(i))){
                maps.put(wordCount, s.charAt(i));
            }
        }
        String [] words = s.split("\\W+");
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        StringBuilder sb = new StringBuilder();
        Collections.reverse(wordList);

        for(int i=0; i<wordList.size(); i++){
            if(!wordList.get(i).equals("")){
                sb.append(wordList.get(i));
                if(maps.containsKey(i)){
                    sb.append(maps.get(i));
                }
                sb.append(" ");
            }
        }


        return sb.toString();


    }
}
