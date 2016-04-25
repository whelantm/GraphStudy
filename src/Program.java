import java.util.*;

/**
 * Created by travis on 4/24/16.
 */
public class Program {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tests = s.nextInt();
        for(int t = 0; t < tests; t++) {
            int n = s.nextInt();
            int e = s.nextInt();

            Graph graph = new Graph();

            for(int i = 1; i <= n; i++) {
                graph.addNode(i);
            }

            for(int i = 0; i < e; i ++) {
                int n1 = s.nextInt();
                int n2 = s.nextInt();
                int w = s.nextInt();
                try {
                    graph.createEdge(n1, n2, w);
                }
                catch (Exception ex) {

                }
            }

            Djikstra djikstra = new Djikstra(graph);
            int[] result = djikstra.search(1);
        }
    }
}
