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

            Node[] nodes = new Node[n];
            ArrayList<Edge> edges = new ArrayList<Edge>();

            for(int i = 0; i < n; i++) {
                nodes[i] = new Node(i + 1);
            }

            for(int i = 0; i < e; i ++) {
                int n1 = s.nextInt();
                int n2 = s.nextInt();
                int w = s.nextInt();
                Edge edge = new Edge(nodes[n1-1], nodes[n2-1], w);
                nodes[n1 -1].addEdge(edge);
                edges.add(edge);
                nodes[n1 - 1].edges.add(edge);
            }
        }
    }
}
