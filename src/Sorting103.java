/**
 * @ClassName Sorting103
 * @Description leetcode 240
 * @Author GZfan
 * @Date 19-6-5
 */
public class Sorting103 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        if(row==0){
            return false;
        }
        int col=matrix[0].length;
        for(int i=row-1,j=0;i>=0&&j<col;){
            if(matrix[i][j]==target){
                return true;
            } else if(matrix[i][j]>target){
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
}
