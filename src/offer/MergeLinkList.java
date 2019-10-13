package offer;
/*
* 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeLinkList {

    public static void main(String[] args) {

    }



    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null &&list2==null) {
            return null;
        }
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        {
            return list1;
        }

        ListNode temp  = null;
        if(list1.val<=list2.val)
        {

             temp  = list1;
             list1=list1.next;
        }else {
             temp  = list2;
             list2=list2.next;
        }
        ListNode returnTemp = temp;
        while (list1!=null && list2!=null)
        {
             if(list1.val<=list2.val){
                 temp.next=list1;
                 list1=list1.next;
                 temp=temp.next;
             }
             else  {
                 temp.next=list2;
                 list2=list2.next;
                 temp=temp.next;
             }
        }
        if(list1==null)
        {
            while (list2!=null)
            {
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }else {
            while (list1!=null)
            {
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
        }
        return returnTemp;

    }
}
