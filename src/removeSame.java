
public class removeSame {
    /**
     * leetcode 26
     *@param nums
     *@return int
     */
    public int removeDuplicates(int[] nums) {
        int flag = 0, front = 1;
        if (nums.length == 1)
            return 1;
        else {
            while (front <= nums.length - 1) {
                if (nums[front] > nums[flag]) {
                    flag++;
                    nums[flag] = nums[front];
                }
                front++;
            }
            ++flag;
            return flag;
        }
    }
}
