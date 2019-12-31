import java.util.HashMap;

/**
 * @ClassName Leetcode454
 * @Description
 * @Author GZfan
 * @Date 2019/12/31
 */
public class Leetcode454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        int count = 0;
        for (int c : C) {
            for (int d : D) {
                count += map.getOrDefault(-c - d, 0);
            }
        }
        return count;
    }
}
