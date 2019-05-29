import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Trees89
 * @Description leetcode 238
 * @Author GZfan
 * @Date 19-5-29
 */
public class Trees89 {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> nodes=new LinkedList<>();
        TreeNode temp=null;
        while(root!=null||nodes.size()!=0){
            while(root!=null){
                nodes.push(root);
                root=root.left;
            }
            temp=nodes.pop();
            k--;
            if(k==0){
                break;
            }
            if(temp.right!=null){
                root=temp.right;
            }
        }
        return temp.val;
    }
}
