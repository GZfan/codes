import java.util.Arrays;

/**
 * @ClassName Array25
 * @Description leetcode 136
 * @Author GZfan
 * @Date 19-4-20
 */
public class Array25 {
    public int singleNumber(int[] nums) {
        int length=nums.length;
        if(length==1)
            return nums[0];
        int num=nums[0];
        Arrays.sort(nums);
        for(int i=0;i<length-2;i=i+2)
        {
            if(nums[i]!=nums[i+1]){
                num=nums[i];
                break;
            }
            if(i+2==length-1)
                num=nums[i+2];
        }
        return num;
    }

}
