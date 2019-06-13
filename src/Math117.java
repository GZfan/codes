/**
 * @ClassName Math117
 * @Description leetcode 29
 * @Author GZfan
 * @Date 19-6-13
 */
public class Math117 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int positiveDividend = dividend > 0 ? 0 - dividend : dividend;
        int positiveDivisor = divisor > 0 ? 0 - divisor : divisor;
        int leftTime = 0;
        int result = 0;
        int maxRight1 = Integer.MIN_VALUE >> 1;
        if (dividend == 0 || positiveDividend - positiveDivisor > 0) {
            return 0;
        }
        while (positiveDividend - positiveDivisor < 0) {
            if (positiveDivisor < maxRight1 || positiveDividend - (positiveDivisor << 1) > 0) {
                break;
            }
            positiveDivisor = positiveDivisor << 1;
            leftTime++;
        }
        result = (1 << leftTime)
                + divide(positiveDividend - positiveDivisor, divisor > 0 ? 0 - divisor : divisor);
        if ((dividend^divisor)<0) {
            result = 0 - result;
        }
        return result;
    }
}
