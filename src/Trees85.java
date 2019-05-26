
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * @ClassName Trees85
 * @Description leetcode 94
 * @Author GZfan
 * @Date 19-5-26
 */
public class Trees85 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer=new ArrayList<>();
        LinkedList<TreeNode> nodes=new LinkedList<>();
        TreeNode temp;
        while(root!=null||nodes.size()!=0){
            while(root!=null){
                nodes.push(root);
                root=root.left;
            }
            temp=nodes.pop();
            answer.add(temp.val);
            if(temp.right!=null){
                root=temp.right;
            }
        }
        return answer;
    }
}
