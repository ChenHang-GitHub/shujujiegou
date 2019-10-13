package offer;

import javax.sound.midi.Soundbank;

/*
* 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode head1 =new ListNode(1);
        ListNode head2 =new ListNode(2);
        ListNode head3 =new ListNode(3);
        ListNode head4 =new ListNode(4);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;

        ListNode listNode = ReverseList(head1);
        System.out.println(listNode.val+""+listNode.next.val);

    }
    public static ListNode ReverseList(ListNode head) {

        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
        ListNode tempNode =new ListNode(0);
        ListNode cur = head;
        ListNode next = null;
        while (cur!=null)
        {
            next=cur.next;
            cur.next=tempNode.next;
            tempNode.next=cur;
            cur=next;
        }
        return tempNode.next;

    }
}
