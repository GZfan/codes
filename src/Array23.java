import java.awt.font.NumericShaper;

/**
 * @ClassName Array23
 * @Description leetcode189
 * @Author GZfan
 * @Date 19-4-18
 */
public class Array23 {
    public void rotate(int[] nums, int k) {
        int arraylength=nums.length;
        int t=0;
        if(arraylength==0||arraylength==1)
            ;
        else{
            for(int i=0;i<k;i++)
            {
                t=nums[arraylength-1];
                for(int j=arraylength-2;j>=0;j--)
                    nums[j+1]=nums[j];
                nums[0]=t;
            }
        }
    }
}
