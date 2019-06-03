/**
 * @ClassName Sorting99
 * @Description leetcode 162
 * @Author GZfan
 * @Date 19-6-3
 */
public class Sorting99 {
    public int findPeakElement(int[] nums) {
        if(nums.length==1||nums[0]>nums[1]){
            return 0;
        }  else if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int i=1;
        for(;i<nums.length-2;i++){
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                break;
            }
        }
        return i;
    }
}
