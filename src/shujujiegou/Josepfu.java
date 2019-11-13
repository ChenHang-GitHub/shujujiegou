package shujujiegou;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * 约瑟夫问题 (无头节点单向循环链表)
 * */
public class Josepfu {
    public static void main(String[] args) {
        singleCircleLink singleCircleLink = new singleCircleLink();
        singleCircleLink.addManToCircle(5);
        singleCircleLink.showCircle();
        singleCircleLink.getOutputCircle(2, 1, 5);

    }
}


class singleCircleLink {
    private ManNode first = null;

    public void addManToCircle(int num) {
        if (num <= 0) {
            System.out.println("err");
            return;
        }
//        临时指针结点
        ManNode cur = null;
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                first = new ManNode(i);
                first.next = first;
                cur = first;
            }else {
                ManNode manNode = new ManNode(i);
                cur.next = manNode;
                manNode.next = first;
                cur = manNode;
            }
        }
    }

    public void showCircle() {

        if (first == null) {
            System.out.println("err");
        }
        ManNode cur = first;
        while (cur.next != first) {
            System.out.print(cur.no + "-->");
            cur = cur.next;
        }
        System.out.println(cur.no + "^");
//        System.out.println(cur.next.no);     //测试最后一个结点是否指向first

    }

    public void getOutputCircle(int startNo, int MoveNum, int ManNum) {
        ManNode cur = first;
        if (startNo <= 0 || MoveNum <= 0 || ManNum <= 0) {
            System.out.println("err");
            return;
        }

        while (cur.next != first) {
            cur = cur.next;
        }
//        System.out.println(cur.no+" poll.cur.no");
        // 找到开始ManNode
        for (int j = 0; j < startNo - 1; j++) {
            first = first.next;
            cur = cur.next;
        }
        while (true) {

            if (cur.next == first.next) {
                break;
            }
            for (int i = 0; i < MoveNum - 1; i++) {
                first = first.next;
                cur = cur.next;
            }
            System.out.println(first.no + "-->");
            first = first.next;
            cur.next = first;
        }
        System.out.println(cur.no + "end");


    }


}

class ManNode {
    int no;
    ManNode next;

    public ManNode(int no) {
        this.no = no;
        this.next = next;
    }


}