import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Leetcode131
 * @Description
 * @Author GZfan
 * @Date 2019/12/24
 */
public class Leetcode131 {
    public List<List<String>> partition(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                dp[i][i + len - 1] = s.charAt(i) == s.charAt(i + len - 1) && (len < 3 || dp[i + 1][i + len - 2]);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        partitionHelper(s, 0, dp, new ArrayList<>(), ans);
        return ans;
    }

    private void partitionHelper(String s, int start, boolean[][] dp, List<String> temp, List<List<String>> res) {
        if (start == s.length()) {
            res.add(new ArrayList<>(temp));
        }
        for (int i = start; i < s.length(); i++) {
            if (dp[start][i]) {
                String left = s.substring(start, i + 1);
                temp.add(left);
                partitionHelper(s, i + 1, dp, temp, res);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
