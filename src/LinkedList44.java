/**
 * @ClassName LinkedList44
 * @Description leetcode21
 * @Author GZfan
 * @Date 19-5-4
 */
public class LinkedList44 {
    public class ListNode {
        int val;
        LinkedList44.ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        ListNode l3=null;
        if(l1.val>l2.val){
            l3=l2;
            l2=l2.next;
        } else{
            l3=l1;
            l1=l1.next;
        }
        ListNode head=l3;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                l3.next=l2;
                l2=l2.next;
            } else{
                l3.next=l1;
                l1=l1.next;
            }
            l3=l3.next;
        }
        if(l1==null) {
            l3.next = l2;
        } else{
            l3.next=l1;
        }
        return head;
    }

}
