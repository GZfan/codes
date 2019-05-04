/**
 * @ClassName LinkedList43
 * @Description leetcode 206
 * @Author GZfan
 * @Date 19-5-4
 */
public class LinkedList43 {
    public class ListNode {
        int val;
        LinkedList43.ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode front=head.next,back=null;
        while(front!=null){
            head.next=back;
            back=head;
            head=front;
            front=head.next;
        }
        head.next=back;
        return head;
    }
}
