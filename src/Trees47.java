/**
 * @ClassName Trees47
 * @Description leetcode104
 * @Author GZfan
 * @Date 19-5-9
 */
public class Trees47 {
    private static int maxLen;
    public int maxDepth(TreeNode root) {
        maxLen=0;
        if(root==null);
        else
            deep(root,1);
        return maxLen;
    }
    private static void deep(TreeNode node,int len){
        if(node.left==null){
            if(len>maxLen)
                maxLen=len;
        }else {
            deep(node.left,len+1);
        }
        if(node.right==null){
            if(len>maxLen)
                maxLen=len;
        }else {
            deep(node.right,len+1);
        }
    }
}
