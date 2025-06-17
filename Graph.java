import java.util.*;
public class Graph {
    private Map<Integer, List<Integer>> adjList;
    private boolean isDirected;
    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        adjList = new HashMap<>();
    }
    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }
    public void addEdge(int src, int dest) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(dest);
        if (!isDirected) {
            adjList.get(dest).add(src);
        }
    }
    public void removeEdge(int src, int dest) {
        List<Integer> srcList = adjList.get(src);
        List<Integer> destList = adjList.get(dest);
        if (srcList != null) {
            srcList.remove(Integer.valueOf(dest));
        }
        if (!isDirected && destList != null) {
            destList.remove(Integer.valueOf(src));
        }
    }
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    public Map<Integer, List<Integer>> getAdjList() {
        return adjList;
    }
    public static void main(String[] args) {
        Graph g = new Graph(false); 
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        System.out.println("Graph:");
        g.printGraph();
        g.removeEdge(1, 2);
        System.out.println("\nAfter removing edge 1-2:");
        g.printGraph();
    }
}
