import java.util.Arrays;

/**
 * @ClassName dynamic105
 * @Description leetcode 62
 * @Author GZfan
 * @Date 19-6-6
 */
public class dynamic105 {
    public int uniquePaths(int m, int n) {
        int[][] mark=new int[m][n];
        Arrays.fill(mark[0],1);
        for (int i = 0; i <mark.length ; i++) {
            mark[i][0]=1;
        }
        for(int i=1;i<mark.length;i++){
            for(int j=1;j<mark[0].length;j++){
                mark[i][j]=mark[i-1][j]+mark[i][j-1];
            }
        }
        return mark[m-1][n-1];
    }
}
