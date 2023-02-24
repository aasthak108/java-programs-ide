package graph;

import java.util.LinkedList;
import java.util.Queue;
public class BfsTraversal {
    static int node;
   static LinkedList<Integer> adj[];
   static Queue<Integer> q;
    BfsTraversal(int v)
    {
        node = v;
        adj = new LinkedList[node];
        for(int i=0;i<v;i++)
        {
            adj[i]= new LinkedList<Integer>();
        }
        q = new LinkedList<Integer>();
    }
    void addEdge(int u , int v)
    {
        adj[u].add(v);
    }
    public static void bfsTraversal(int s)
    {
        boolean vis[] = new boolean[node];
        int v=0;
        vis[s] = true;
        q.add(s);
        while(q.size()!=0)
        {
            s = q.poll();
            System.out.println(" " + s);
            for(int i =0;i<adj[s].size();i++)
            {
                v = adj[s].get(i);
                if(!vis[v])
                {
                    vis[v] = true;
                    q.add(v);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        BfsTraversal graph = new BfsTraversal(6);
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
        graph.bfsTraversal(4);
    }
}