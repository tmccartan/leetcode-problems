package strings;

public class PalindromeII {


    /*
    * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

        Example 1:
        Input: "aba"
        Output: True
        Example 2:
        Input: "abca"
        Output: True
        Explanation: You could delete the character 'c'.
        Note:
        The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
    *
    * */
    public boolean validPalindrome(String s) {
        // loop from start and end and break in middle
        // if the chars don't match
        // try move left + 1 or move right -1
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i+1 ,j) || isPalindrome(s, i ,j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int i, int j){

        while( i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
