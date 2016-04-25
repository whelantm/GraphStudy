import java.util.*;

/**
 * Created by travis on 4/24/16.
 */
public class Graph {
    private List<Node> nodes;
    private List<Edge> edges;

    public Graph() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void addNode(int data) {
        Node node = new Node(data);
        nodes.add(node);
    }

    public void createEdge(int node1, int node2, int weight) throws Exception {
        Node n1 = findNode(node1);
        Node n2 = findNode(node2);

        if (n1 == null || n2 == null) {
            throw new Exception("node not found");
        }

        Edge edge = new Edge(n1, n2, weight);
        edges.add(edge);
        n1.addEdge(edge);
        n2.addEdge(edge);
    }

    public Node findNode(int node) {
        for (Node n : nodes) {
            if (n.data == node) {
                return n;
            }
        }
        return null;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
