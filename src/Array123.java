/**
 * @ClassName Array123
 * @Description leetcode 238
 * @Author GZfan
 * @Date 19-6-17
 */
public class Array123 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int left=1;
        for(int i=0;i<ans.length;i++){
            ans[i]=left;
            left=left*nums[i];
        }
        int right=1;
        for(int j=ans.length-1;j>=0;j--){
            ans[j]*=right;
            right=right*nums[j];
        }
        return ans;
    }
}
