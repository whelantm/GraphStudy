import java.util.*;

/**
 * Created by travis on 4/24/16.
 */
public class Djikstra {
    private Graph graph;
    private List<Edge> edges;
    private List<Node> nodes;
    private Set<Node> settledEdges;
    private Set<Node> unsettledEdges;

    public Djikstra(Graph graph) {
        this.graph = graph;
        this.edges = graph.getEdges();
        this.nodes = graph.getNodes();
    }


}
