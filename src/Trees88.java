import java.util.LinkedList;

/**
 * @ClassName Trees88
 * @Description leetcode 166
 * @Author GZfan
 * @Date 19-5-27
 */
public class Trees88 {
    private LinkedList<Node> line=new LinkedList<>();
    public Node connect(Node root) {
        line.offer(root);
        level();
        return root;
    }
    private void level(){
        Node front,tail=null;
        int num=line.size();
        if(num==0){
            return;
        }
        if(num>=1){
            tail=line.poll();
            num--;
        }
        while(num>0){
            front=tail;
            tail=line.poll();
            front.next=tail;
            if(front.left!=null){
                line.offer(front.left);
            }
            if(front.right!=null){
                line.offer(front.right);
            }
            num--;
        }
        if(tail!=null) {
            tail.next = null;
            if (tail.left != null) {
                line.offer(tail.left);
            }
            if (tail.right != null) {
                line.offer(tail.right);
            }
        }
        level();
    }
}
