/**
 * @ClassName Dp56
 * @Description leetcode 53
 * @Author GZfan
 * @Date 19-5-13
 */
public class Dp56 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
