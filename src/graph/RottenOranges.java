package graph;

import java.util.LinkedList;
import java.util.Queue;
//used bfs
public class RottenOranges
{
    public static int orangesRotting(int[][] grid)
    {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int[] dr ={-1, 0, 1, 0};
        int[] dc = {0,1,0,-1};
        int fresh =0;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j,0});
                    vis[i][j] = 2;
                }
                else
                {
                    vis[i][j] =0;
                }
                if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        int count=0, timeMax=0;
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            int time = curr[2];
            timeMax = Math.max(timeMax,time);
            for(int i =0;i<4;i++)
            {
                int r = row+ dr[i];
                int c = col+ dc[i];
                if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1
                        && vis[r][c]!=2)
                {
                    vis[r][c] = 2;
                    q.add(new int[]{r,c,time+1});
                    count++;
                }
            }
        }
        return (count == fresh) ? timeMax : -1;
    }
    public static void main(String args[])
    {
        int[][] grid = {
                {2, 1, 0, 1, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}
        };
        System.out.println(""+ orangesRotting (grid));
    }
}
