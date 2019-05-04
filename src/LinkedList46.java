/**
 * @ClassName LinkedList46
 * @Description leetcode 141
 * @Author GZfan
 * @Date 19-5-4
 */
public class LinkedList46 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
