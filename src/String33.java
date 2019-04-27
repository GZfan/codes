import java.math.BigInteger;
import java.util.LinkedList;

/**
 * @ClassName String33
 * @Description leetcode 7
 * @Author GZfan
 * @Date 19-4-27
 */
public class String33 {
    public int reverse(int x) {
        Boolean positive = true;
        if (x < 0) {
            positive = false;
            x = 0 - x;
        }
        if(x==-2147483648)
            return 0;
        LinkedList stack = new LinkedList();
        while (x > 0) {
            stack.addFirst(x % 10);
            x = x / 10;
        }

        int mul = 1, size = 1;
        while (!stack.isEmpty()) {
            if (size == 10) {
                BigInteger num = BigInteger.valueOf(x);
                BigInteger high = BigInteger.valueOf(mul);
                high=high.multiply(BigInteger.valueOf((Integer) stack.removeFirst()));
                num=num.add(high);
                if (num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
                    return 0;
                } else {
                    if (positive)
                        return num.intValue();
                    else return 0 - num.intValue();
                }
            }
            x = x + mul * (Integer) stack.removeFirst();
            mul *= 10;
            size++;
        }
        if (!positive) {
            x = 0 - x;
        }
        return x;
    }
}
