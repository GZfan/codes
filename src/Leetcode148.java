import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @ClassName Leetcode148
 * @Description
 * @Author GZfan
 * @Date 2019/12/26
 */
public class Leetcode148 {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> que=new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        while (head!=null){
            que.offer(head);
            head=head.next;
        }
        ListNode ans=new ListNode(0);
        ListNode t=ans;
        int size=que.size();
        for(;size>0;size--){
            t.next=que.poll();
            t=t.next;
        }
        t.next=null;
        return ans.next;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode end=new ListNode(3);
        ListNode mid=new ListNode(2);
        end.next=mid;
        ListNode start=new ListNode(1);
        mid.next=start;
        Leetcode148 t=new Leetcode148();
        ListNode ans=t.sortList(end);
    }
}

