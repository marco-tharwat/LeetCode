import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList <Integer> result = new ArrayList<>();
        int UP = 0, RIGHT = 1, DOWN = 2, LEFT = 3;
        int direction = RIGHT;
        int UP_WALL = 0, RIGHT_WALL = n, DOWN_WALL = m, LEFT_WALL = -1;
        int i = 0, j = 0;

        while (result.size() < m * n){
            if (direction == RIGHT){
                while (j < RIGHT_WALL){
                    result.add(matrix[i][j]);
                    j++;
                }
                i++;
                j--;
                RIGHT_WALL--;
                direction = DOWN;
            }
            else if (direction == DOWN) {
                while (i < DOWN_WALL){
                    result.add(matrix[i][j]);
                    i++;
                }
                i--;
                j--;
                DOWN_WALL--;
                direction = LEFT;
            }
            else if (direction == LEFT) {
                while (j > LEFT_WALL){
                    result.add(matrix[i][j]);
                    j--;
                }
                i--;
                j++;
                LEFT_WALL++;
                direction = UP;
            }
            else {
                while (i > UP_WALL){
                    result.add(matrix[i][j]);
                    i--;
                }
                i++;
                j++;
                UP_WALL++;
                direction = RIGHT;
            }
        }
        return result;
    }
}