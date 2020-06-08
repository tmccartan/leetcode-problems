package strings;

import java.util.HashMap;

public class MakingAnagrams {


    int makingAnagrams(String a, String b) {
        int deletions =0;
        HashMap<Character, Integer> aFreq = new HashMap<>();
        HashMap<Character, Integer> bFreq = new HashMap<>();

        for(int i = 'a'; i<='z'; i++){
            aFreq.put((char) i, 0);
            bFreq.put((char) i, 0);
        }

        for(int i =0; i<a.length();i++){
            aFreq.put(a.charAt(i), aFreq.get(a.charAt(i))+1);
        }
        for(int i =0; i<b.length();i++){
            bFreq.put(b.charAt(i), bFreq.get(b.charAt(i))+1);
        }

        for(Character key: aFreq.keySet()){
            deletions+= Math.abs(aFreq.get(key) - bFreq.get(key));
        }
        return deletions;
    }
}
