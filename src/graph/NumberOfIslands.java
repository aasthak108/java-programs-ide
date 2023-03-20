package graph;

public class NumberOfIslands {
    static int numberOfIslands(int matrix[][],int row,int column)
    {
        int count=0;
        if(matrix.length==0)
            return 0;
        for(row=0;row<matrix.length;row++)
        {
            for(column=0;column<matrix[0].length;column++)
            {
                if(matrix[row][column] == 1) {
                    dfs(row, column, matrix);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int row,int column,int matrix[][]) {
        if(row<0 || row>=matrix.length || column<0 || column>=matrix[0].length)
            return;
        if(matrix[row][column]==0)
            return;
            matrix[row][column] = 0;
            dfs(row + 1, column, matrix);
            dfs(row - 1, column, matrix);
            dfs(row, column +1, matrix);
            dfs(row , column - 1, matrix);

    }

    public static void main(String[] args)
    {
        int matrix[][] =  {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1}};
        System.out.println(numberOfIslands(matrix,0,0));
    }
}
