package offer;

/*
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * */
public class deleteDuplicationNode {

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode head = new ListNode(0);//避免第一个头结点就重复
        head.next=pHead;
        ListNode preNode = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.next!=null && cur.val == cur.next.val) {
                while (cur.next!=null&&cur.val==cur.next.val)
                {
                    cur=cur.next;
                }
                preNode.next=cur.next;
                cur=cur.next;
            }else {
                preNode=preNode.next;
                cur=cur.next;
            }

        }
        return head.next;
    }

}
