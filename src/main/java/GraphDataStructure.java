import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphDataStructure {
    int nodeCount;
    int edgeCount;
    List<Integer>[] edges;
    boolean directed = false;
    GraphDataStructure(int numberOfNodes, boolean isDirected) {
        this.directed = isDirected;
        this.nodeCount = numberOfNodes;
        edges = new List[this.nodeCount];
        for (int i = 0; i < this.nodeCount; i++)
            edges[i] = new ArrayList<>();
    }
    void addEdge(int source, int destination){
        edges[source].add(destination);
        if(!directed)
            edges[destination].add(source);
    }
}
