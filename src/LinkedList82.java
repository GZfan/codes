/**
 * @ClassName LinkedList82
 * @Description leetcode 2
 * @Author GZfan
 * @Date 19-5-25
 */
public class LinkedList82 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=l1,head=l1;
        int carry=0,temp=0;
        while(l1.next!=null&&l2.next!=null){
            temp=l1.val+l2.val+carry;
            carry=temp/10;
            l3.val=temp%10;
            l1=l1.next;
            l2=l2.next;
            l3.next=l1;
            l3=l3.next;
        }
        temp=l1.val+l2.val+carry;
        carry=temp/10;
        l3.val=temp%10;
        if(l1.next==null&&l2.next==null){
            if(carry==1){
                l3.next=new ListNode(1);
                carry=0;
            }
        }
        else if(l1.next==null) {
            l3.next = l2.next;
        } else if (l2.next==null) {
            l3.next = l1.next;
        }
        if(carry!=0){
            while(l3.next!=null){
                l3=l3.next;
                temp=l3.val+carry;
                carry=temp/10;
                l3.val=temp%10;
                if(carry==0){
                    break;
                }
            }
            if(carry==1){
                l3.next=new ListNode(1);
            }
        }
        return head;
    }
}
