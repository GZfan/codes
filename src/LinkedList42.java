/**
 * @ClassName LinkedList42
 * @Description leetcode19
 * @Author GZfan
 * @Date 19-5-2
 */
public class LinkedList42 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=new ListNode(head.val);
        node.next=head.next;
        int len=1;
        while(node.next!=null){
            node=node.next;
            len++;
        }
        if(len==1){
            head=null;
            return head;
        }
        node=head;
        len=len-n;
        if(len==0){
            head=head.next;
        }
        while(len>1){
            node=node.next;
            len--;
        }
        if(node.next!=null) {
            node.next = node.next.next;
        }
        else{
            node=null;
        }
        return head;
    }
}
