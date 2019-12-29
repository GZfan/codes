/**
 * @ClassName Leetcode235
 * @Description
 * @Author GZfan
 * @Date 2019/12/29
 */
public class Leetcode235 {
    private TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.recruseTree(root, p, q);
        return ans;
    }

    private boolean recruseTree(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        int left = this.recruseTree(root.left, p, q) ? 1 : 0;
        int right = this.recruseTree(root.right, p, q) ? 1 : 0;
        int mid = ((root == p) || (root == q)) ? 1 : 0;
        if (left + right + mid >= 2) {
            ans = root;
        }
        return (left + right + mid > 0);
    }
}
