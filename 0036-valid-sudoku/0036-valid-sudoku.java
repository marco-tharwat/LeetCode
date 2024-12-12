import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0;i < 9;i++) {
            HashSet <Character> set = new HashSet <> ();
            for (int j = 0;j < 9;j++){
                if (set.contains(board[i][j]))
                    return false;
                if (board[i][j] == '.')
                    continue;
                set.add(board[i][j]);
            }
        }
        for (int i = 0;i < 9;i++) {
            HashSet <Character> set = new HashSet <> ();
            for (int j = 0;j < 9;j++){
                if (set.contains(board[j][i]))
                    return false;
                if (board[j][i] == '.')
                    continue;
                set.add(board[j][i]);
            }
        }
        int starts [][] = {{0,0},{0,3},{0,6}
                          ,{3,0},{3,3},{3,6}
                          ,{6,0},{6,3},{6,6}};
        for (int start[]:starts){
            HashSet <Character> set = new HashSet<>();
            for (int i = start[0];i < start[0] + 3;i++){
                for (int j = start[1];j < start[1] + 3;j++){
                    if (set.contains(board[i][j]))
                        return false;
                    if (board[i][j] == '.')
                        continue;
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
}