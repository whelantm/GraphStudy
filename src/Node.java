import java.util.ArrayList;

/**
 * Created by travis on 4/24/16.
 */
public class Node {
    int data;
    ArrayList<Edge> edges;

    public Node(int data) {
        this.data = data;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Edge edge) {
        if (!edges.contains(edge)) {
            edges.add(edge);
        }
    }
}
