/**
 * @ClassName Math116
 * @Description leetcode 69
 * @Author GZfan
 * @Date 19-6-12
 */
public class Math116 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long right = x, left = 0, mid = left + (right - left) / 2;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else if ((mid + 1) * (mid + 1) > x) {
                break;
            } else {
                left = mid + 1;
            }
        }
        return new Long(mid).intValue();
    }
}
