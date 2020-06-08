package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SecretSanta {

    public static void main(String[] args){

        List<String> members = new ArrayList<String>();
        members.add("Terry");
        members.add("Yvonne");
        members.add("Jake");
        members.add("Marian");
        members.add("John");
        members.add("James");
        members.add("Mary");
        members.add("Todd");


        HashMap<String,String> result = secretSanta(members);

        if(result == null){
            System.out.println("Invalid Game");
        } else{
            for (String name: result.keySet()){
                String key = name.toString();
                String value = result.get(name).toString();
                System.out.println(key + " " + value);
            }
        }

    }

    public static HashMap<String, String> secretSanta(List<String> members){

        if(members.size() == 0 || members.size() % 2 != 0){
            return null;
        }
        HashMap<String, String> secretSanta = new HashMap<>();
        int n =  members.size();
        for(int i = 0; i <n ; i++){
            String santa = members.get(i);
            String recp = members.get(n - i - 1);
            secretSanta.put(santa, recp);
        }
        return secretSanta;
    }


}
