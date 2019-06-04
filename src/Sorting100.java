/**
 * @ClassName Sorting100
 * @Description leetcode 34
 * @Author GZfan
 * @Date 19-6-4
 */
public class Sorting100 {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid;
            } else if (nums[mid]<target){
                left=mid;
            } else {
                left=right=mid;
                while(left>=0&&nums[left]==nums[mid]){
                    left--;
                }
                while(right<nums.length&&nums[right]==nums[mid]){
                    right++;
                }
                res[0]=left+1;
                res[1]=right-1;
                break;
            }
            if(left==right-1&&nums[left]!=target){
                left++;
            } else if (left==right&&nums[left]!=target){
                break;
            }
        }
        return res;
    }
}
