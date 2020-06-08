package bfs;

import java.util.ArrayList;
import java.util.List;

public class GenerateParathesis {

    public List<String> generateParenthesis(int n) {

        List<String> output = new ArrayList<>();
        if(n ==0){
            return output;
        }

        generate(output, "", 0, 0, n);
        return output;
    }

    public void generate(List<String> output, String current, int open, int close, int total){
        if(current.length() == total * 2){
            output.add(current);
            return;
        }
        if(open < total){
            generate(output, current +"(", open +1, close, total);
        }

        if(close<open){
            generate(output, current +")", open, close +1, total);
        }

    }

}
