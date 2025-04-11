package U.Lec26_Theory;
import java.util.*;

public class Grapht_inp_adjacency_list {
    public static void main(String[] args) {
        int n = 5 , m = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i <= n;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i = 0;i < n;i++){
            for (int j = 0;j < adj.get(i).size();j++){
                System.out.println(adj.get(i).get(j));
            }
            System.out.println();
        }
    }
}
