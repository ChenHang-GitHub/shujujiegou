package shujujiegou;

/*
* 双向循环链表*/
public class DoubleCircleNode {

    int data ;
    DoubleCircleNode pre ;
    DoubleCircleNode next;

    public  void insertNext (DoubleCircleNode n)
    {
        DoubleCircleNode nextNext  = this.next;
        this.next = n;
        n.pre=this;
        n.next=nextNext;
        nextNext.pre=n;
        nextNext.next=this;
    }
    public  void  removeNext()
    {
        DoubleCircleNode nextNext = this.next.next;
        this.next=nextNext;
        nextNext.pre=this;
    }
    public  DoubleCircleNode (int data)
    {
        this.data = data;
        this.pre=this;
        this.next=this;
    }
    public static void main(String[] args) {
        DoubleCircleNode n1 = new DoubleCircleNode(1);
        DoubleCircleNode n2 = new DoubleCircleNode(2);
        DoubleCircleNode n3 = new DoubleCircleNode(3);
        n1.insertNext(n2);
        n2.insertNext(n3);
        System.out.println(n1.data+n1.next.data+n1.next.next.data);
        System.out.println(n1.pre.data);

    }
}
