import java.util.Arrays;

/**
 * @ClassName Sorting98
 * @Description leetcode 215
 * @Author GZfan
 * @Date 19-6-3
 */
public class Sorting98 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
