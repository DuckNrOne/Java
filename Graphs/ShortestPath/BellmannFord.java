package Others;

/**
 * The Bellman–Ford algorithm1 finds shortest paths from a starting node to all
 * nodes of the graph. The algorithm can process all kinds of graphs, provided that
 * the graph does not contain a cycle with negative length. If the graph contains a
 * negative cycle, the algorithm can detect this.
 * The algorithm keeps track of distances from the starting node to all nodes
 * of the graph. Initially, the distance to the starting node is 0 and the distance to
 * all other nodes in infinite. The algorithm reduces the distances by finding edges
 * that shorten the paths until it is not possible to reduce any distance.
 * Source: "Competitive Programmer’s Handbook" by Antti Laaksonen
 */

import java.util.*;

public class BellmannFord {

    /**
     * main function
     * Will run the code with "GRAPH" that was defined above.
     */
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1, 7),
        g.addEdge(0, 2, 9),
        g.addEdge(0, 5, 14),
        g.addEdge(1, 2, 10),
        g.addEdge(1, 3, 15),
        g.addEdge(2, 3, 11),
        g.addEdge(2, 5, 2),
        g.addEdge(3, 4, 6),
        g.addEdge(4, 5, 9),
        int[] distances = g.bellmannford(0);
        System.out.println(Arrays.toString(distances));
    }
}

class Graph {
    // mapping of vertex names to Vertex objects, built from a set of Edges
    private final Set<Edge> graph = new HashSet<>();
    private final ArrayList<Integer> nodes = new ArrayList<>();

    /**
     * One edge of the graph (only used by Graph constructor)
     */
    public static class Edge {
        public final int v1, v2, dist;

        public Edge(int v1, int v2, int dist) {
            this.v1 = v1;
            this.v2 = v2;
            this.dist = dist;
        }
    }

    /**
     * Creates a graph
     */
    public Graph() {}

    /**
     * Adds a edge
     */
    public void addEdge(int v1, int v2, int dist){
        graph.add(new Graph.Edge(v1, v2, dist));
        if(!nodes.contains(v1)) nodes.add(v1);
        if(!nodes.contains(v2)) nodes.add(v2);
    }

    public int[] bellmannford(int startNode){
        int[] distances = new int[nodes.size()];
        for(int i = 0; i < distances.length; i++) distances[i] = Integer.MAX_VALUE;
        distances[startNode] = 0;
        for (int i = 1; i < ; i++) {
            for (Edge e : edges) {
                distance[e.v2] = min(distance[e.v2], distance[e.v1]+e.dist);
            }
        }
        return distances;
    }
}