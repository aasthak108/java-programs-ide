package graph;

public class NumberOfProvince {
    public static int numberOfProvince(int [][]matrix, boolean visited[])
    {
        int count=0;
        for(int i =0;i<matrix.length;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(matrix,visited,i);
            }
        }
        return count;

    }
    public static void dfs(int matrix[][],boolean[] visited, int vertex)
    {
        visited[vertex]= true;
        for(int i =0;i<matrix[vertex].length;i++)
        {
            if(matrix[vertex][i]==1 && !visited[i]) {
                dfs(matrix, visited, i);
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] matrix = {{1,0,0},{0,1,0},{1,1,1}};
        boolean visited[] = new boolean[matrix.length];
        System.out.println(numberOfProvince(matrix,visited));
    }

}
