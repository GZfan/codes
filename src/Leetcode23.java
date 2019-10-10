import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ClassName Leetcode23
 * @Description
 * @Author GZfan
 * @Date 2019/10/10
 */
public class Leetcode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> que=new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (ListNode list : lists) {
            if(list!=null){
                que.add(list);
            }
        }
        ListNode head=new ListNode(-1);
        ListNode node=head;
        while(!que.isEmpty()){
            ListNode min=que.poll();
            node.next=min;
            node=node.next;
            if(min.next!=null){
                que.add(min.next);
            }
        }
        return head.next;
    }
}
