package graph;
import java.util.*;

class DfsTraversal {
    private int V;
    private LinkedList<Integer>[] adjList;

    DfsTraversal(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {

        adjList[u].add(v);
        adjList[v].add(u);
    }

    void DFS(int start) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        visited[start] = true;
        stack.push(start);

        while (!stack.empty()) {
            int curr = stack.pop();
            System.out.print(curr + " ");

            LinkedList<Integer> neighbors = adjList[curr];
            for (int i = 0; i < neighbors.size(); i++) {
                int next = neighbors.get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    stack.push(next);
                }
            }
        }
    }
    public static void main(String[] args)
    {

        DfsTraversal graph = new DfsTraversal(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);
        System.out.println("Breadth First Traversal for the graph is:");
        graph.DFS(0);
    }
}