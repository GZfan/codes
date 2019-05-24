/**
 * @ClassName Array80
 * @Description leetcode 334
 * @Author GZfan
 * @Date 19-5-24
 */
public class Array80 {
    public boolean increasingTriplet(int[] nums) {
        int len=nums.length;
        int min=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        for (int i = 0; i < len ; i++) {
            if(nums[i]<=min){
                min = nums[i];
            }else if(nums[i]<=mid){
                mid = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}
