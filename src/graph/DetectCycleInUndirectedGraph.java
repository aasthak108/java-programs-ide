package graph;
import java.util.*;
    class Graph {
        private int V; // number of vertices
        private LinkedList<Integer>[] adj; // adjacency list for each vertex

        public Graph(int V) {
            this.V = V;
            adj = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        // add edge to the graph
        public void addEdge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u);
        }

        // DFS traversal to detect cycle in the graph
        public boolean hasCycle() {
            boolean[] visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (dfs(i, visited, -1)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean dfs(int v, boolean[] visited, int parent) {
            visited[v] = true;
            for (int i : adj[v]) {
                if (!visited[i]) {
                    if (dfs(i, visited, v)) {
                        return true;
                    }
                }
                else if (i != parent) {
                    return true;
                }
            }
            return false;
        }
    }

    public class DetectCycleInUndirectedGraph {
        public static void main(String[] args) {
            Graph g = new Graph(5);
            g.addEdge(0, 1);
            g.addEdge(1, 2);
            g.addEdge(2, 3);
            g.addEdge(3, 5);
            if (g.hasCycle()) {
                System.out.println("Graph contains cycle");
            } else {
                System.out.println("Graph does not contain cycle");
            }
        }
    }