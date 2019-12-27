/**
 * @ClassName Leetcode287
 * @Description
 * @Author GZfan
 * @Date 2019/12/27
 */
public class Leetcode287 {
    public int findDuplicate(int[] nums) {
        int slow=0,fast=0;
        slow=nums[slow];
        fast=nums[nums[fast]];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        int pre=0;
        while(pre!=slow){
            pre=nums[pre];
            slow=nums[slow];
        }
        return pre;
    }
}
