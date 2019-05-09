
/**
 * @ClassName Trees48
 * @Description leetcode 98
 * @Author GZfan
 * @Date 19-5-9
 */
public class Trees48 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            TreeNode temp = root.left;
            while (temp != null && temp.right != null) {
                temp = temp.right;
            }
            if (temp != null && root.val <= temp.val)
                return false;
            temp = root.right;
            while (temp != null && temp.left != null) {
                temp = temp.left;
            }
            if (temp != null && root.val >= temp.val)
                return false;
            return isValidBST(root.left) && isValidBST(root.right);
        }
    }

}
