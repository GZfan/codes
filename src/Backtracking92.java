import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Backtracking92
 * @Description leetcode 22
 * @Author GZfan
 * @Date 19-5-30
 */
public class Backtracking92 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        get(result, n, n, "");
        return result;
    }

    private static void get(List<String> result, int left, int right, String str) {
        if (left == 0 && right == 0) {
            result.add(str);
        } else if (right >= left) {
            if (left > 0) {
                get(result, left - 1, right, str + "(");
            }
            if (right > 0) {
                get(result, left, right - 1, str + ")");
            }
        }
        return;
    }
}
