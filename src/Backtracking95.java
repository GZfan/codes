import java.util.Arrays;

/**
 * @ClassName Backtracking95
 * @Description
 * @Author GZfan
 * @Date 19-6-1
 */
public class Backtracking95 {
    boolean[][] visit;
    private boolean judge;
    public boolean exist(char[][] board, String word) {
        judge=false;
        int row=board.length;
        if(row==0){
            return judge;
        }
        int col=board[0].length;
        if(row*col>word.length()){
            return judge;
        }
        visit=new boolean[row][col];
        for(int i=0;i<row;i++){
            Arrays.fill(visit[i],false);
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    check(1,word,word.length(),i,j,board);
                    if(judge){
                        return judge;
                    }
                }
            }
        }
        return judge;
    }
    private boolean check(int index,String word,int len,int row,int col,char[][] board){
        if(index>=len){
            judge=true;
            return true;
        }
        visit[row][col]=true;
        if(row!=0&&!visit[row-1][col]&&board[row-1][col]==word.charAt(index)){
            if(check(index+1,word,len,row-1,col,board)){
                return true;
            }
        }
        if(row!=board.length-1&&!visit[row+1][col]&&board[row+1][col]==word.charAt(index)){
            if(check(index+1,word,len,row+1,col,board)){
                return true;
            }
        }
        if(col!=0&&!visit[row][col-1]&&board[row][col-1]==word.charAt(index)){
            if(check(index+1,word,len,row,col-1,board)){
                return true;
            }
        }
        if(col!=board[0].length-1&&!visit[row][col+1]&&board[row][col+1]==word.charAt(index)){
            if(check(index+1,word,len,row,col+1,board)){
                return true;
            }
        }
        visit[row][col]=false;
        return false;
    }
}


