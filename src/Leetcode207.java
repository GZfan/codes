import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Leetcode207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return false;
        }
        int plen = prerequisites.length;
        if (plen == 0) {
            return true;
        }
        int[] inDegree = new int[numCourses];
        for (int[] p : prerequisites) {
            inDegree[p[0]]++;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        // 首先加入入度为 0 的结点
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.addLast(i);
            }
        }
        // 拓扑排序的结果
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            Integer num = queue.removeFirst();
            res.add(num);
            // 把邻边全部遍历一下
            for (int[] p : prerequisites) {
                if (p[1] == num) {
                    inDegree[p[0]]--;
                    if (inDegree[p[0]] == 0) {
                        queue.addLast(p[0]);
                    }
                }
            }
        }
        return res.size() == numCourses;
    }
}
