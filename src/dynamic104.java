import java.util.Arrays;

/**
 * @ClassName dynamic104
 * @Description leetcode 55
 * @Author GZfan
 * @Date 19-6-6
 */
public class dynamic104 {
    public boolean canJump(int[] nums) {
        boolean[] judge=new boolean[nums.length];
        Arrays.fill(judge,false);
        judge[0]=true;
        for(int i=0;i<nums.length;i++){
            if(judge[i]){
                fill(judge,i,nums[i]);
            }
        }
        return judge[nums.length-1];
    }
    private void fill(boolean[] judge,int index,int len){
        int i=index+1;
        while(len>0&&i<judge.length){
            judge[i]=true;
            len--;
            i++;
        }
        return ;
    }

}
