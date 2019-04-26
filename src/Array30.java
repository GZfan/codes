import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Array30
 * @Description leetcode 36
 * @Author GZfan
 * @Date 19-4-26
 */
public class Array30 {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++){
                for(int k=i+1;k<9;k++){
                    if(board[i][j]!='.'&&board[i][j]==board[k][j])
                        return false;
                }
                for(int k=j+1;k<9;k++){
                    if(board[i][j]!='.'&&board[i][j]==board[i][k])
                        return false;
                }
            }
        Set<Character> set=new HashSet<>();
        for(int i=0;i<9;i=i+3)
            for(int j=0;j<9;j=j+3) {
                int size=0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (board[k][l] != '.') {
                            set.add(board[k][l]);
                            size++;
                        }
                    }
                }
                if(set.size()!=size)
                    return false;
                set.clear();
            }
         return true;
    }
}

