public class NumMatrix {
    private int[][] mat;
    public NumMatrix(int[][] matrix)
    {
        int sum = 0;
        mat = new int[matrix.Length + 1][];
        for (int i = 0; i < mat.Length; i++)
        {
            mat[i] = new int[matrix[0].Length + 1];
        }
        for (int i = 0; i < matrix.Length; i++)
        {
            for (int j = 0; j < matrix[0].Length; j++)
            {
                sum += matrix[i][j];
                mat[i + 1][j + 1] = sum + mat[i][j + 1];
            }
            sum = 0;
        }
    }

    public int SumRegion(int row1, int col1, int row2, int col2)
    {
        return mat[row2 + 1][col2 + 1] - mat[row1][col2 + 1] - mat[row2 + 1][col1] + mat[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.SumRegion(row1,col1,row2,col2);
 */