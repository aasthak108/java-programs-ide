package graph;
public class NumberOfProvince {

    public static int countProvinces(int[][] adjacencyMatrix) {
        int numVertices = adjacencyMatrix.length;
        int numProvinces = 0;
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                numProvinces++;
                dfs(adjacencyMatrix, visited, i);
            }
        }

        return numProvinces;
    }

    private static void dfs(int[][] adjacencyMatrix, boolean[] visited, int vertex) {
        visited[vertex] = true;

        for (int i = 0; i < adjacencyMatrix[vertex].length; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                dfs(adjacencyMatrix, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        int numProvinces = countProvinces(adjacencyMatrix);
        System.out.println("Number of provinces: " + numProvinces);
    }
}
