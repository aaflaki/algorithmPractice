package GraphWithCollections;

public class CreateGraph {


    public static void main(String[] args) {
        GraphDataStructureMap myGraph = new GraphDataStructureMap();
        myGraph.addVertex("alec");
        myGraph.addVertex("mona");
        myGraph.addEdge("alec", "mona");
        System.out.println(myGraph);
    }
}
