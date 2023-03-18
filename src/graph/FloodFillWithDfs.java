package graph;

public class FloodFillWithDfs {
    public static void dfs (int[][] newMatrix, int sr, int sc, int newColor, int oldColor){
            if (sr < 0 || sr >= newMatrix.length || sc < 0 || sc >= newMatrix[0].length)
                return;
                if( newMatrix[sr][sc]!=oldColor)
                    return;
                newMatrix[sr][sc]=newColor;
            dfs(newMatrix, sr - 1, sc,2,1); // up
            dfs(newMatrix, sr + 1, sc,2,1); // down
            dfs(newMatrix, sr, sc - 1,2,1); // left
            dfs(newMatrix, sr, sc + 1,2,1); // right
        }
        public int[][] floodFill(int[][] newMatrix,int sr,int sc,int newColor) {
                int[][] ans = newMatrix;
               int x = ans.length;
               int y = ans[0].length;
               int oldColor = 1;
               newColor = 2;
               oldColor = newMatrix[sr][sc];
            dfs(ans,1,1,2,1);
               return ans;

            }
            public static void main(String[] args) {
                int[][]  newMatrix = {{1,1,1}, {1, 1, 0}, {1, 0, 1}};
                //boolean[][] visited = new boolean[newMatrix.length][newMatrix[0].length];
                FloodFillWithDfs obj = new FloodFillWithDfs();
                int [][]answer = obj.floodFill(newMatrix,1,1,2);
                for (int i = 0; i < answer.length; i++) {
                    for (int j = 0; j < answer[0].length; j++) {
                        System.out.print(" " +answer[i][j]);
                    }
                    System.out.println("");
                }
            }
    }
