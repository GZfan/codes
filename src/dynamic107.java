import java.util.Arrays;

/**
 * @ClassName dynamic107
 * @Description leetcode 300
 * @Author GZfan
 * @Date 19-6-7
 */
public class dynamic107 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int longest=0;
        for(int num:dp){
            if(num>longest){
                longest=num;
            }
        }
        return longest;
    }
}
