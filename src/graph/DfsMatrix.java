package graph;
public class DfsMatrix {


    public static void main(String[] args) {
        int[][] matrix = {{1, 0,0}, {1,1,0}, {1,1,1}};
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        dfs(matrix, 0, 0, visited);
    }
    public static void dfs(int[][] matrix, int row, int col, boolean[][] visited) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || visited[row][col]) {
            return;
        }
        visited[row][col] = true;
        System.out.println(matrix[row][col]);
        dfs(matrix, row-1, col, visited); // up
        dfs(matrix, row+1, col, visited); // down
        dfs(matrix, row, col-1, visited); // left
        dfs(matrix, row, col+1, visited); // right
    }
}

