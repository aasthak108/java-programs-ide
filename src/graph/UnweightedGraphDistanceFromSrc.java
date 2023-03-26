package graph;
import java.util.LinkedList;
import java.util.Queue;
public class UnweightedGraphDistanceFromSrc {
    static int node ;
   static LinkedList<Integer> adj[];
   static  Queue<Integer> q;
    UnweightedGraphDistanceFromSrc(int v)
    {
        node = v;
        adj = new LinkedList[node];
        for(int i =0;i<v;i++)
        {
            adj[i] = new LinkedList<>();
        }
        q = new LinkedList<>();
    }
    void addEdge(int u , int v)
    {
        adj[u].add(v);
    }
    public static int  []calculateDistance(int u)
    {
        boolean vis[] = new boolean[node];
        int[] distance = new int[node];
        distance[u] = 0;
        int v =0;
        vis[u] = true;
        q.add(u);
        while(q.size()!=0)
        {
            u = q.poll();
            for(int i=0;i<adj[u].size();i++)
            {
                 v= adj[u].get(i);
                 if(!vis[v])
                 {
                     vis[v] = true;
                     distance[v] =  distance[u] +1;
                     q.add(v);
                 }
            }
        }
        return distance;
    }
    public static void main(String[] args)
    {
        UnweightedGraphDistanceFromSrc graph = new UnweightedGraphDistanceFromSrc(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge( 2, 0);
        int[] dis = graph.calculateDistance(0);
        for(int i=0;i<dis.length;i++)
        {
            System.out.print(" " + dis[i]);
        }
        System.out.println(" ");
    }
}
