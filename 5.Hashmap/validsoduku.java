import java.util.HashMap;

public class validsoduku {
    public boolean isValid(char[][] board, int rowStart, int colStart, int rowEnd, int colEnd) {
        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                char current = board[i][j];
                if (current != '.') {
                    m.put(current, m.getOrDefault(current, 0) + 1);
                    if (m.get(current) > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
                if(!isValid(board,i,0,i,8)) return false;
                if(!isValid(board,0,i,8,i)) return false;
        }
        //3x3 matrix check
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!isValid(board,i,j,i+2,j+2)) return false;
            }
        }
        return true;
    }
}
