
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Design109
 * @Description
 * @Author GZfan
 * @Date 19-6-8
 */
public class Design109 {

    private Integer index;

    public Design109() {
        index = 0;
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        build(sb, root);
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    private void build(StringBuilder sb, TreeNode node) {
        if (node != null) {
            sb.append(node.val).append(',');
            build(sb, node.left);
            build(sb, node.right);
        } else {
            sb.append('#').append(',');
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        return build(data.split(","));
    }

    private TreeNode build(String[] nodes) {
        if (index == nodes.length || nodes[index].equals("#")) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodes[index]));
        index++;
        node.left = build(nodes);
        node.right = build(nodes);
        return node;
    }

}
