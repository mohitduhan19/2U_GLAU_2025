
package U.Lec27_Theory;

import java.util.ArrayList;

public class Dfs {
    public void dfs(int node ,boolean[] vis , ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> lis){
        vis[node] = true;
        lis.add(node);

        for(Integer i : adj.get(node)){
            if(vis[i] == false){
                dfs(i , vis , adj , lis);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[adj.size()+1];
        vis[0] = true;
        ArrayList<Integer> lis = new ArrayList<>();
        dfs(0 , vis, adj , lis);
        return lis;
    }
}
