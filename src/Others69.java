/**
 * @ClassName Others69
 * @Description leetcode 268
 * @Author GZfan
 * @Date 19-5-20
 */
public class Others69 {
    public int missingNumber(int[] nums) {
        int[] sort=new int[nums.length+1];
        for(int num:nums){
            sort[num]=1;
        }
        int i=0;
        for(;i<nums.length+1;i++){
            if(sort[i]!=1){
                break;
            }
        }
        return i;
    }
}
