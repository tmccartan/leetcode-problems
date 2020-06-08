package strings;

public class StudentAttendanceRecordI {


    /*
      You are given a string representing an attendance record for a student. The record only contains the following three characters:
      'A' : Absent.
      'L' : Late.
      'P' : Present.
      A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

      You need to return whether the student could be rewarded according to his attendance record.

    */


    // for each char in s
    // if we see an absence, increment the absence count, if its 2 return false
    // if we see a three continous L, return false
    // otherwise return true;
    public boolean checkRecord(String s) {
        int absenceCount = 0;
        int lateCount = 0;


        for(char c: s.toCharArray()){

            if(c == 'P'){
                lateCount = 0;

            } else if (c == 'L'){
                lateCount++;
                if(lateCount == 3) {
                    return false;
                }

            } else if (c == 'A'){
                lateCount = 0;
                absenceCount++;
                if(absenceCount ==2){
                    return false;
                }
            } else {
                // Unknown input?
            }

        }
        return true;
    }
}
