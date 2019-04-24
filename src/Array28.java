/**
 * @ClassName Array28
 * @Description leetcode 283
 * @Author GZfan
 * @Date 19-4-24
 */
public class Array28 {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        if(len==0||len==1)
            return;
        for(int j=0,flag=len-1;j<flag;j++){
            if(nums[j]==0){
                for(int i=j+1;i<=flag;i++) {
                    nums[i-1]=nums[i];
                }
                nums[flag]=0;
                flag--;
                if(nums[j]==0)
                    j--;
            }
        }
    }
}
