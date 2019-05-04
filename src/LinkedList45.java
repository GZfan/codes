/**
 * @ClassName LinkedList45
 * @Description leetcode 234
 * @Author GZfan
 * @Date 19-5-4
 */
public class LinkedList45 {
    public class ListNode {
        int val;
        LinkedList45.ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        int len=1,tempLen=0;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        tempLen=len/2;
        temp=head;
        for(int i=1;i<=tempLen;i++){
            temp=temp.next;
        }
        if(len%2==1){
            temp=temp.next;
        }
        temp=reverseList(temp);
        for(int i=0;i<tempLen;i++){
            if(head.val!=temp.val)
                return false;
            head=head.next;
            temp=temp.next;
        }
        return true;
    }
    public static ListNode reverseList(ListNode head) {
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
