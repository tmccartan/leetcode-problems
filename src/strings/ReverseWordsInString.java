package strings;

public class ReverseWordsInString {

    public static String reverseWords(String input){

        // find a space and break up the words
        // reverse the array
        // add the array to String Builder with spaces

        String [] words = input.split("\\W");

        int i =0;
        int j = words.length-1;

        while(i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(word);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String [] args){
        String input1 = "Hello word";
        System.out.println(reverseWords(input1));
    }
}
