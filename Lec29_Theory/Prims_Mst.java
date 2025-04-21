package U.Lec29_Theory;
import java.util.*;

public class Prims_Mst {
   public static int spanningTree(int V, int E, List<List<int[]>> adj) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean[] visited = new boolean[V];
        int res = 0;
        pq.offer(new int[] {0, 0});

        // Perform Prim's algorithm
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int wt = current[0];
            int u = current[1];
            if (visited[u]) {
                continue;
            }
            res += wt;
            visited[u] = true;

            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int weight = edge[1];

                if (!visited[v]) {
                    pq.offer(new int[] {weight, v});
                }
            }
        }

        return res;
    }
}
