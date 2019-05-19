import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Others67
 * @Description leetcode118
 * @Author GZfan
 * @Date 19-5-19
 */
public class Others67 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri=new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            List<Integer> line=new ArrayList<>();
            for(int j = 0; j<=i;j++){
                if(j==0||j==i){
                    line.add(1);
                } else{
                    line.add(tri.get(i-1).get(j-1)+tri.get(i-1).get(j));
                }
            }
            tri.add(line);
        }
        return tri;
    }
}
