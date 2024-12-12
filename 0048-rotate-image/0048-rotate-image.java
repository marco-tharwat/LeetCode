class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int temp = 0;

        for (int i = 0;i < length;i++){
            for (int j = i + 1;j < length;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            for (int k = 0;k < length / 2;k++){
                temp = matrix[i][k];
                matrix[i][k] = matrix[i][length - 1 - k];
                matrix[i][length - 1 - k] = temp;
            }
        }
    }
}