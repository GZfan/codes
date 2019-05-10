import java.util.ArrayList;

/**
 * @ClassName trees49
 * @Description
 * @Author GZfan
 * @Date 19-5-10
 */
public class Trees49 {
    private static ArrayList nodes = new ArrayList();

    public boolean isSymmetric(TreeNode root) {
        nodes=new ArrayList();
        if (root == null) {
            return true;
        }
        getNodes(root);
        int len = nodes.size();
        for (int i = 0; i < len / 2; i++) {
            if ((int) (nodes.get(i)) != (int) (nodes.get(len - i - 1)))
                return false;
        }
        return true;

    }

    private static void getNodes(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null) {
            getNodes(root.left);
        }
        nodes.add(root.val);
        if (root.right != null) {
            getNodes(root.right);
        }
        return;
    }

}
