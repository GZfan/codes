import java.util.*;

/**
 * @ClassName Trees51
 * @Description leetcode 102
 * @Author GZfan
 * @Date 19-5-10
 */
public class Trees51 {
    private static List<List<Integer>> list=new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        list=new ArrayList<List<Integer>>();
        if(root==null)
            return list;
        List<TreeNode> nextLevel=new ArrayList<>();
        nextLevel.add(root);
        while(nextLevel.size()!=0){
            nextLevel=next(nextLevel);
        }
        return list;
    }
    private static List<TreeNode> next(List<TreeNode> currentLevel){
        List<TreeNode> nextLevel=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        for(TreeNode node:currentLevel){
            if(node==null)
                break;
            num.add(node.val);
            if(node.left!=null){
                nextLevel.add(node.left);
            }
            if(node.right!=null){
                nextLevel.add(node.right);
            }
        }
        list.add(num);
        return nextLevel;
    }
}
