package strings;

public class CheckRecord {
}

class Solution {
    public boolean checkRecord(String s) {

        // false if contains more that one A or two consec L

        // loop over s
        // countAbsence ++ if A
        // record we have a L for next iteration
        // if P then reset L

        int absences = 0;
        int lates = 0;

        for(char c: s.toCharArray()){
            if(c == 'A'){
                absences++;
                lates = 0;
                if(absences >= 2){
                    return false;
                }
            } else if(c == 'L'){
                lates++;
                if(lates == 3){
                    return false;
                }
            } else{
                lates = 0;
            }
        }
        return true;
    }
}