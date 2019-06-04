import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Sorting101
 * @Description leetcode 56
 * @Author GZfan
 * @Date 19-6-4
 */
public class Sorting101 {
    public int[][] merge(int[][] intervals) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<2;j++){
                if(intervals[i][j]>max){
                    max=intervals[i][j];
                } else if (intervals[i][j]<min){
                    min=intervals[i][j];
                }
            }
        }
        byte[] space=new byte[max-min+1];
        for(int[] nums:intervals) {
            Arrays.fill(space,nums[0]-min,nums[1]-min,(byte)1);
        }
        ArrayList<Integer> boun=new ArrayList<>();
        for (int i = 0; i < space.length; i++) {
            if(space[i]==1){
                boun.add(i+min);
                while(i<space.length&&space[i]==1){
                    i++;
                }
                boun.add(i+min);
            }
        }
        int size=boun.size()/2;
        int[][] res=new int[size][2];
        for (int i = 0; i < size; i++) {
            res[i][0]=boun.get(2*i);
            res[i][1]=boun.get(2*i+1);
        }
        return res;
    }
}

