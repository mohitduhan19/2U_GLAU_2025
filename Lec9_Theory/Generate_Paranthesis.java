package U.Lec9_Theory;
import java.util.*;

public class Generate_Paranthesis {
    public void help(List<String> ans , String curr ,  int open , int close , int n){
        if(curr.length() == 2*n){
            ans.add(curr);
            return;
        }
        if(open < n)help(ans , curr + '('  , open +1 , close ,n);
        if(close < open)help(ans , curr + ')'  , open , close + 1 ,n);

    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = 1 , close = 0;
        help(ans , "(" , open , close , n);
        return  ans;
    }
}
