import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Backtracking93
 * @Description
 * @Author GZfan
 * @Date 19-5-31
 */
public class Backtracking93 {
    private static List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        Node root = new Node(Integer.MIN_VALUE);
        for (int num : nums) {
            root.next.add(new Node(num));
        }
        buildTree(root);
        depthFist(root, new ArrayList<>());
        return result;
    }

    private void buildTree(Node root) {
        int size = root.next.size();
        for (int i = 0; i < size; i++) {
            Node temp = root.next.get(i);
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    temp.next.add(new Node(root.next.get(j).val));
                }
            }
            this.buildTree(temp);
        }
    }

    private void depthFist(Node node, ArrayList<Integer> item) {
        if (node.val != Integer.MIN_VALUE) {
            item.add(node.val);
        }
        int size = node.next.size();
        if (size == 0) {
            result.add(item);
        }
        for (int i = 0; i < size; i++) {
            depthFist(node.next.get(i), new ArrayList<>(item));
        }
    }

    private class Node {
        public Node(int val) {
            this.val = val;
            this.next = new ArrayList<>();
        }

        public int val;
        List<Node> next;
    }
}
