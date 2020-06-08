package strings;

public class ReverseString {


    public static String reverseString(String input){
        if(input == null || input.length() == 0){
            return input;
        }
        int inputLength = input.length()-1;
        StringBuilder sb = new StringBuilder();

        for(int i = inputLength; i >=0; i--){
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String [] args){

        String input = "hello";
        System.out.println(reverseString(input));
        String input2 = "hi";
        System.out.println(reverseString(input2));
    }
}
