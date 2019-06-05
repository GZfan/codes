
/**
 * @ClassName Sorting102
 * @Description leetcode 33
 * @Author GZfan
 * @Date 19-6-5
 */
public class Sorting102 {
    public int search(int[] nums, int target) {
        int locate = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                locate = mid;
                break;
            }
            if (left == right && nums[left] != target) {
                break;
            }
            if (nums[right] >= nums[mid] && nums[mid] >= nums[left]) {
                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[left] >= nums[right] && nums[right] >= nums[mid]) {
                if (nums[mid] > target) {
                    right = mid-1;
                } else {
                    if (nums[right] >= target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            } else if (nums[mid] >= nums[left] && nums[left] >= nums[right]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                break;
            }
        }
        return locate;
    }

}
