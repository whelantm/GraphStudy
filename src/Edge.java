/**
 * Created by travis on 4/24/16.
 */
public class Edge {
    Node node1;
    Node node2;
    boolean visited;
    int weight;

    public Edge(Node n1, Node n2, int weight) {
        this.node1 = n1;
        this.node2 = n2;
        this.weight = weight;

        this.visited = false;
    }

    public boolean isVisited() {
        return visited;
    }

    public void visit() {
        visited = true;
    }

    public int getWeight() {
        return weight;
    }

    public Node getNode1() {
        return node1;
    }

    public Node getNode2() {
        return node2;
    }
}
