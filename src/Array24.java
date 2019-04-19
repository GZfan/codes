import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @ClassName Array24
 * @Description leetcode 217
 * @Author GZfan
 * @Date 19-4-19
 */
public class Array24 {
    public boolean containsDuplicate(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        boolean mark = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                mark = true;
                break;
            }
        }
        return mark;
    }

    private int partition(int[] nums, int low, int high) {
        int mid = low + (high - low) / 2;
        int temp;
        if (nums[mid] > nums[high]) {
            temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
        }
        if (nums[low] > nums[high]) {
            temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
        }
        if (nums[mid] > nums[low]) {
            temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
        }
        int key = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= key)
                high--;
            nums[low] = nums[high];
            while (low < high && nums[low] < key)
                low++;
            nums[high] = nums[low];
        }
        nums[high] = key;
        return high;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low >= high)
            return;
        int index = partition(nums, low, high);
        quickSort(nums, low, index - 1);
        quickSort(nums, index + 1, high);
    }

}
