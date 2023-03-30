package graph;
import java.util.LinkedList;
public class AdjLinkedList {
    static int v;
    static LinkedList<Integer>[] adj;
    AdjLinkedList(int v)
    {
        this.v=v;
        adj = new LinkedList[v];
        for(int i =0;i<v;i++)
        {
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(LinkedList<Integer> adj[], int u,int v) {
        adj[u].add(v);
        adj[v].add(u);
    }
    public static void printGraph(LinkedList<Integer>[] adj)
    {
        for(int i = 0; i<v; i++)
        {
            for(int j=0;j<adj[i].size(); j++)
            {
                System.out.print("-->" + j);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        AdjLinkedList graph = new AdjLinkedList(6);
        graph.addEdge(adj,0, 1);
        graph.addEdge(adj,0, 3);
        graph.addEdge(adj,0, 4);
        graph.addEdge(adj,4, 5);
        graph.addEdge(adj,3, 5);
        graph.addEdge(adj,1, 2);
        graph.addEdge(adj,1, 0);
        graph.addEdge(adj,2, 1);
        graph.addEdge(adj,4, 1);
        graph.addEdge(adj,3, 1);
        graph.addEdge(adj,5, 4);
        graph.addEdge(adj,5, 3);
        graph.printGraph(adj);
    }
}
