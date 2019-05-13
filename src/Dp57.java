/**
 * @ClassName Dp57
 * @Description leetcode 198
 * @Author GZfan
 * @Date 19-5-13
 */
public class Dp57 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        if (len == 1)
            return nums[0];
        else if (len == 2)
            return nums[0] > nums[1] ? nums[0] : nums[1];
        else if (len == 3)
            return nums[0] + nums[2] > nums[1] ? nums[0] + nums[2] : nums[1];
        else {
            int[] max = new int[len + 1];
            max[1] = nums[0];
            max[2] = nums[0] > nums[1] ? nums[0] : nums[1];
            max[3] = nums[0] + nums[2] > nums[1] ? nums[0] + nums[2] : nums[1];
            for (int i = 4; i <= len; i++) {
                max[i] = max[i - 2] > max[i - 3] ? (max[i - 2] + nums[i - 1]) : (max[i - 3] + nums[i - 1]);
            }
            return max[len] > max[len - 1] ? max[len] : max[len - 1];
        }
    }
}
