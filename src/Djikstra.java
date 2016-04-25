import java.util.*;

/**
 * Created by travis on 4/24/16.
 */
public class Djikstra {
    private Graph graph;
    private List<Edge> edges;
    private List<Node> nodes;
    private Set<Node> settledNodes;
    private Set<Node> unsettledNodes;
    private Map<Node, Integer> distances;
    private Map<Edge, Edge> predecessor;

    public Djikstra(Graph graph) {
        this.graph = graph;
        this.edges = graph.getEdges();
        this.nodes = graph.getNodes();
    }


    public int[] search(int source) {
        settledNodes = new HashSet<>();
        unsettledNodes = new HashSet<>();
        distances = new HashMap<>();
        predecessor = new HashMap<>();
        Node start;
        for (Node n : nodes) {
            if (n.data == source) {
                start = n;
                distances.put(n, 0);
            }
            else {
                distances.put(n, Integer.MAX_VALUE);
            }
        }

        return new int[0];
    }
}
