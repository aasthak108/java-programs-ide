package graph;
import java.util.ArrayList;
import java.util.Stack;

//u->v( u comes before v)

public class TopologicalSortingDFS
{
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj)
    {
        int[] vis = new int[adj.size()];
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer>answer=new ArrayList<>();
        for(int i =0;i<adj.size();i++)
        {
            if(vis[i]==0)
            {
                dfs(i,adj,st,vis);
            }
        }
        while(!st.isEmpty())
        {
            answer.add(st.pop());
        }
        return answer;
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st, int[]vis)
    {
        vis[node] =1;
        for(int it:adj.get(node))
        {
            if(vis[it]==0)
            {
                dfs(it,adj,st,vis);
            }
        }
        st.push(node);
    }
    public static void main(String args[])
    {
        int n = 6;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            adj.add(new ArrayList<>());
        }
        // Add edges (directed graph)
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);
        // Perform topological sort
        ArrayList<Integer> result = topologicalSort(adj);
        // Print the result
        System.out.println("Topological Sort Order: " + result);
    }
}

