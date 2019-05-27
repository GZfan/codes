import java.util.Arrays;

/**
 * @ClassName Trees87
 * @Description leetcode 105
 * @Author GZfan
 * @Date 19-5-27
 */
public class Trees87 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int locate = inorderLocate(root.val, inorder);
        if (locate != -1) {
            int[] newPre = Arrays.copyOfRange(preorder, 1, locate + 1);
            root.left = buildTree(newPre,
                    Arrays.copyOfRange(inorder, 0, locate));
            root.right = buildTree(Arrays.copyOfRange(preorder, locate + 1, preorder.length),
                    Arrays.copyOfRange(inorder, locate + 1, inorder.length));
        }
        return root;
    }

    private static int inorderLocate(int val, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            if (val == inorder[i]) {
                return i;
            }
        }
        return -1;
    }

}
