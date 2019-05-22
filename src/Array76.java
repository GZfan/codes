
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Array76
 * @Description leetcode 73
 * @Author GZfan
 * @Date 19-5-22
 */
public class Array76 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> column=new HashSet<>();
        int len1=matrix.length;
        int len2=matrix[0].length;
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i:row){
            for(int j=0;j<len2;j++){
                matrix[i][j]=0;
            }
        }
        for(int j:column){
            for (int i = 0; i < len1; i++) {
                matrix[i][j]=0;
            }
        }
        return;
    }
}
