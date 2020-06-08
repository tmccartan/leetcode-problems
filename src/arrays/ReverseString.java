package arrays;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        char tmp;
        int lastIndex = s.length - 1;
        int firstIndex = 0;

        while(firstIndex < lastIndex) {

            tmp = s[firstIndex];
            s[firstIndex] = s[lastIndex];
            s[lastIndex] = tmp;
            lastIndex--;
            firstIndex++;
        }
    }

    public static void main(String[] args){

        char [] input1 = new char[] {'h','e','l','l','o'};
        reverseString(input1);
        System.out.println(input1);
        char [] expected1 = new char[] {'o','l','l','e','h'};
        assert (input1 == expected1);

        char [] input2 = new char[] {'H','a','n','n','a','h'};
        char [] expected2 = new char[] {'h','a','n','n','a','H'};
        reverseString(input2);
        System.out.println(input2);
        assert (input2 == expected2);
    }
}
