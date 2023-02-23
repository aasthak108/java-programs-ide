package graph;

public class AdjMatrix {
    int vertex;
    int mat[][];
    AdjMatrix(int v)
    {
        vertex = v;
        mat= new int[vertex][vertex];
    }
    public void addEdge(int source,int destination)
    {
        mat[source][destination]=1;
        mat[destination][source]=1;
    }
    public void printGraph()
    {
        for(int i =0;i<vertex;i++)
        {
            for(int j=0;j<vertex;j++)
            {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        AdjMatrix adj = new AdjMatrix(5);
        adj.addEdge(0,1);
        adj.addEdge(2,3);
        adj.addEdge(1,2);
        adj.addEdge(3,4);
        adj.printGraph();
    }
}
