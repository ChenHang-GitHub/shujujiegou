package offer;
/*
* 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {

    public static void main(String[] args) {

    }
    /*
  public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0)
        {
            return null;
        }
        ListNode preNode =head ;
        ListNode lastNode = head;
        for(int i =0;i<k-1;i++)
        {
            if(lastNode.next!=null)
            {

                lastNode=lastNode.next;
            }else {
                return null;
            }
        }
        while (lastNode.next!=null)
        {
            lastNode=lastNode.next;
            preNode=preNode.next;
        }

        return preNode;
    }
}
