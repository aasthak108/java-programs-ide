package graph;
import java.util.*;
public class BfsMatrix {
    private int[][] matrix; // 2D matrix
    private boolean[][] visited; // visited flag for each node
    private int numRows, numCols; // number of rows and columns in matrix

    public BfsMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.numRows = matrix.length;
        this.numCols = matrix[0].length;
        this.visited = new boolean[numRows][numCols];
    }

    public void bfs(int startRow, int startCol) {
        // create a queue for BFS
        Queue<int[]> queue = new LinkedList<int[]>();

        // mark the starting node as visited and enqueue it
        visited[startRow][startCol] = true;
        queue.add(new int[]{startRow, startCol});

        while (!queue.isEmpty()) {
            // dequeue a vertex from queue and print it
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            System.out.print(matrix[currentRow][currentCol] + " ");

            // check adjacent nodes and enqueue them if not visited
            if (currentRow-1 >= 0 && !visited[currentRow-1][currentCol]) {
                visited[currentRow-1][currentCol] = true;
                queue.add(new int[]{currentRow-1, currentCol});
            }
            if (currentRow+1 < numRows && !visited[currentRow+1][currentCol]) {
                visited[currentRow+1][currentCol] = true;
                queue.add(new int[]{currentRow+1, currentCol});
            }
            if (currentCol-1 >= 0 && !visited[currentRow][currentCol-1]) {
                visited[currentRow][currentCol-1] = true;
                queue.add(new int[]{currentRow, currentCol-1});
            }
            if (currentCol+1 < numCols && !visited[currentRow][currentCol+1]) {
                visited[currentRow][currentCol+1] = true;
                queue.add(new int[]{currentRow, currentCol+1});
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        BfsMatrix bfs = new BfsMatrix(matrix);
        bfs.bfs(0, 0);
    }
}