package offer;

import java.util.ArrayList;
import java.util.Stack;

/*
* 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
* */
public class printListFromTailToHead {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        printListFromTailToHead2(listNode1);
    }

    //用递归解决  (node 的层级很深时 要考虑溢出)
    public static void printListFromTailToHead2(ListNode listNode) {

        if(listNode==null)
        {
            return;
        }
        //开始递归;
        if(listNode!=null)
        {
            printListFromTailToHead2(listNode.next);
        }
        System.out.println(listNode.val);
    }

    //用stack 解决
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null)
        {
            return new ArrayList<Integer>();
        }
        ListNode cur =null;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode.next!=null)
        {
            stack.add(listNode.val);
            listNode=listNode.next;
        }
        while (true)
        {
            list.add(stack.pop());
            if(stack.size()==0)
            {
                break;
            }
        }
        return list;
    }
}




class  ListNode{

    int val ;
    ListNode next =null;

    public ListNode(int val) {
        this.val = val;
    }

}