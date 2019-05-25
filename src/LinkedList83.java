/**
 * @ClassName LinkedList83
 * @Description leetcode 328
 * @Author GZfan
 * @Date 19-5-25
 */
public class LinkedList83 {
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead,even,odd,oddhead;
        if(head==null||head.next==null){
            return head;
        }
        evenHead=head.next;
        even=evenHead;
        odd=head;
        oddhead=head;
        boolean oddJudge=true;
        head=head.next.next;
        while(head!=null){
            if(oddJudge){
                odd.next=head;
                odd=odd.next;
                oddJudge=false;
            } else {
                even.next=head;
                even=even.next;
                oddJudge=true;
            }
            head=head.next;
        }
        even.next=null;
        odd.next=evenHead;
        return oddhead;
    }
}
