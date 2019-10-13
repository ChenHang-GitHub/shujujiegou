package offer;

/*
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * */
public class EntryNodeOfLoop {


    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode preNode = pHead;
        ListNode lastNode = pHead;
        while (true) {
            if (lastNode.next != null && lastNode.next.next != null) {
                preNode = preNode.next;
                lastNode = lastNode.next.next;
                if (preNode == lastNode) {
                    break;
                }

            } else {
                return null;
            }
        }
        int cnt = 1;
        preNode = preNode.next;
        while (preNode != lastNode) {
            cnt++;
            preNode = preNode.next;
        }
        preNode = lastNode = pHead;
        for (int i = 0; i < cnt; i++) {
            lastNode = lastNode.next;
        }
        while (preNode != lastNode) {
            preNode = preNode.next;
            lastNode = lastNode.next;
        }
        return preNode;
    }
}
