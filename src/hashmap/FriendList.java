package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendList {


    /*
    Suppose you are creating an internal networking site for your company.

    You have two data sets to work with. The first data set is the employees at your company, and the second is all the pairs of employees who are virtually friends so far. It does not matter which employee's ID is in which column, the friendships are bidirectional. To get started, you need to represent each data set in code.

    Furthermore, you want to know who’s friends with whom. You need to implement a function that, given the employees and friendships as parameters, returns this data in the form of an adjacency list representation. This is a mapping of each employee ID to a list of his/her friends on the site.

    So, there are two parameters - the employees and the friendships.  Here's one possible example of the employees input array and the friendships input array:

     String[] employeesInput = {
          "1,Richard,Engineering",
          "2,Erlich,HR",
          "3,Monica,Business",
          "4,Dinesh,Engineering",
          "6,Carla,Engineering"
        };


        String[] friendshipsInput = {
          "1,2",
          "1,3",
          "2,4"
        };

    And this would be considered an acceptable form of output for the adjacency list:

    # 1: 2, 3
    # 2: 1, 4
    # 3: 1
    # 4: 2
    # 6: None
     */


    public static void main(String[] args) {
        String[] employeesInput = {
            "1,Richard,Engineering",
            "2,Erlich,HR",
            "3,Monica,Business",
            "4,Dinesh,Engineering",
            "6,Carla,Engineering"
        };


        String[] friendshipsInput = {
            "1,2",
            "1,3",
            "2,4"
        };


        Map<Integer, List<Integer>> friendList = new HashMap<>();

        for(String employee: employeesInput){
            if(Character.isDigit(employee.charAt(0))){
                friendList.put(Character.getNumericValue(employee.charAt(0)), new ArrayList<Integer>());
            } else{
                System.out.println("Invalid Input for employee input");
            }
        }

        for(String friendInput: friendshipsInput){

            System.out.println("Processing "+friendInput);
            // Ensure we have valid string length before parsing
            int friend1 = Character.getNumericValue(friendInput.charAt(0));
            int friend2 = Character.getNumericValue(friendInput.charAt(2));

            if(friend1 == friend2){
                System.out.println("Cannot be friends with themselves");
            } else {
                if(friendList.containsKey(friend1)){
                    List<Integer> tmpList = friendList.get(friend1);
                    tmpList.add(friend2);
                    friendList.put(friend1, tmpList);
                }
                // warn if we seen an assigment we don't know about
                if(friendList.containsKey(friend2)){
                    List<Integer> tmpList = friendList.get(friend2);
                    tmpList.add(friend1);
                    friendList.put(friend2, tmpList);
                }
            }

            //// warn if we seen an assignment we don't know about
        }
        for(int key: friendList.keySet()){

            System.out.println("Friend "+ key + " " +friendList.get(key));
        }
    }
}
