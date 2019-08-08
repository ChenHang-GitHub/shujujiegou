package shujujiegou;
/**
 * 循环链表
 */

public class LoopNode {
    int data ;
    public LoopNode(int data)
    {
        this.data=data;
    }
    LoopNode next;



    public  void removeNext()
    {
        LoopNode curNode = this;
        if(curNode.next==null)
        {
            System.out.println("无下个");
        }else {
            LoopNode newNextNode = curNode.next.next;
            curNode.next = newNextNode;
        }
    }
    public  void  insertNext(LoopNode n )
    {
        LoopNode nextNext = this;
        this.next = n;
        n.next=nextNext;
    }


    public  int getData()
    {
        return  this.data;
    }

    public LoopNode next()
    {
        return this.next;
    }


    public static void main(String[] args) {
        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);
        LoopNode n3 = new LoopNode(3);
        LoopNode n4 = new LoopNode(4);
       n1.insertNext(n2);

        System.out.println(n1.next.data);



    }
}
