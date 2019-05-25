/**
 * @ClassName LinkedList84
 * @Description
 * @Author GZfan
 * @Date 19-5-25
 */
public class LinkedList84 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        if(lenA==0||lenB==0){
            return null;
        }
        ListNode l1, l2;
        if (lenA >= lenB) {
            l1 = skip(headA, lenA - lenB);
            l2 = headB;
        } else {
            l2 = skip(headB, lenB - lenA);
            l1 = headA;
        }
        while (l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }

    private static int getLength(ListNode head) {
        int length = 0;
        ListNode l = head;
        while (l != null) {
            l = l.next;
            length++;
        }
        return length;
    }

    private static ListNode skip(ListNode head, int skip) {
        ListNode temp = head;
        while (skip > 0) {
            temp = temp.next;
            skip--;
        }
        return temp;
    }
}
