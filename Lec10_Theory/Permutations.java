package U.Lec10_Theory;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public void  help(List<List<Integer>> ans , List<Integer> curr , int[] nums , boolean[] vis){

        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0;i < nums.length;i++){
            if(vis[i] == true)continue;
            vis[i] = true;
            curr.add(nums[i]);
            help(ans , curr , nums , vis);
            curr.remove(curr.size() - 1);
            vis[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] vis= new boolean[nums.length];
        help(ans , curr , nums , vis);
        return ans;
    }
}
