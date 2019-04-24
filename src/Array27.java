import java.util.Arrays;

/**
 * @ClassName Array27
 * @Description leetcode 66
 * @Author GZfan
 * @Date 19-4-24
 */
public class Array27 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        Boolean full = false;
        for (int i = 0; i < length; i++) {
            if (digits[i] != 9)
                break;
            if (i == length - 1 && digits[i] == 9)
                full = true;
        }
        if (full) {
            int[] plus = new int[length + 1];
            Arrays.fill(plus, 0);
            plus[0] = 1;
            return plus;
        } else {
            Array27.carry(digits, length - 1);
            return digits;
        }

    }

    private static void carry(int[] digits, int i) {
        if (i >= 0) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] == 0)
                Array27.carry(digits, i - 1);
        }
    }
}
