package shujujiegou;
/**
 * 普通单链表 （ 不带头节点 ）
 */

public class Node {
    int data ;
    public  Node(int data)
    {
        this.data=data;
    }
    Node next;

    public  Node append(Node n)
    {
        Node curNode = this;
        while(true)
        {
            if(curNode.next==null)
            {
                break;
            }
            curNode = curNode.next;
        }
        curNode.next= n;
        return  this;
    }

    public  void removeNext()
    {
        Node  curNode = this;
        if(curNode.next==null)
        {
            System.out.println("无下个");
        }else {
            Node newNextNode = curNode.next.next;
            curNode.next = newNextNode;
        }
    }
    public  void  insertNext(Node n )
    {
        Node nextNext = this.next;
        this.next = n;
        n.next=nextNext;
    }


    public  int getData()
    {
        return  this.data;
    }

    public  Node  next()
    {
        return this.next;
    }

    public  void show ()
    {
        Node curNode = this;
        while (true)
        {
            System.out.print(curNode.data+" ");
            curNode=curNode.next;
            if(curNode==null)
            {
                System.out.println();
                break;
            }
        }

    }
    public static void main(String[] args) {
        Node n = new Node(1);
        n.append(new Node(2)).append(new Node(3));
//        System.out.println(n.next().next.getData());
        n.show();
        n.next.insertNext(new Node(4));
        n.show();



    }
}
