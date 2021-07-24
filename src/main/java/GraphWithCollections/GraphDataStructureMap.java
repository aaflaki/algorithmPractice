package GraphWithCollections;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class GraphDataStructureMap {
    private Map<Vertex, List<Vertex>> adj = new HashMap<>();
    public void addVertex(String label) {
        adj.putIfAbsent(new Vertex(label), new ArrayList<>());
    }
    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adj.values().forEach(e -> e.remove(v));
        adj.remove(v);
    }
    public void addEdge(String source, String destination){
        Vertex s = new Vertex(source);
        Vertex d = new Vertex(destination);
        adj.get(s).add(d);
        adj.get(d).add(s); // undirected assumption
    }
    public void removeEdge(String source, String destination){
        Vertex s = new Vertex(source);
        Vertex d = new Vertex(destination);
        adj.get(s).remove(d);
        adj.get(d).remove(s);
    }

}
