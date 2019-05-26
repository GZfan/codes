import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Trees86
 * @Description leetcode 103
 * @Author GZfan
 * @Date 19-5-26
 */
public class Trees86 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer=new ArrayList<>();
        if(root==null){
            return answer;
        }
        LinkedList<TreeNode> nodes=new LinkedList<>();
        boolean oddLevel=true;
        nodes.push(root);
        int count=1;
        while(!nodes.isEmpty()){
            int num=count;
            count=0;
            List<Integer> line=new ArrayList<>();
            TreeNode[] level=new TreeNode[num];
            for (int i = 0; i <num ; i++) {
                level[i]=nodes.pop();
            }
            for(TreeNode t:level){
                if(!oddLevel&&t.right!=null){
                    nodes.push(t.right);
                    count++;
                }
                if(!oddLevel&&t.left!=null){
                    nodes.push(t.left);
                    count++;
                }
                if(oddLevel&&t.left!=null){
                    nodes.push(t.left);
                    count++;
                }
                if(oddLevel&&t.right!=null){
                    nodes.push(t.right);
                    count++;
                }
                line.add(t.val);
                num--;
            }
            oddLevel=!oddLevel;
            answer.add(line);
        }
        return answer;
    }
}
