/**
 * @ClassName Array31
 * @Description
 * @Author GZfan
 * @Date 19-4-26
 */
public class Array31 {
    public void rotate(int[][] matrix) {
        int length=matrix.length;
        for(int i=0;i<length;i++)
            for(int j=i+1;j<length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                temp=0;
            }
        for(int i=0,j=length-1;i<j;i++,j--){
            for(int k=0;k<length;k++){
                int temp=matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=temp;
                temp=0;
            }
        }
    }

}
