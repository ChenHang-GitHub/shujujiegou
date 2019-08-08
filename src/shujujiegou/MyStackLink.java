package shujujiegou;

/*
* 栈的链表实现 maxsize
* */
public class MyStackLink {
    StackNode firstNode; //代表当前的结点 随着push和pop移动
    int maxsize;
    private int  top = -1;

    public MyStackLink(int maxsize)
    {
        this.top=-1;
        this.maxsize=maxsize;
        firstNode = new StackNode();
    }


    //判断栈满？
    public  boolean isFull ()
    {
        return  top==maxsize-1;
    }
    //判断栈空？

    public  boolean isEmpty()
    {
        return top==-1;
    }
    public  void  push(int data)
    {
        if(this.isFull())
        {
            System.out.println("Full");
            return;
        }
        top++;
        StackNode next = new StackNode(data);
        firstNode.next= next;
        next.pre=firstNode;
        firstNode=next;
    }
    public  int  pop ()
    {
        if(this.isEmpty())
        {
            System.out.println("Empty");
            throw  new RuntimeException("Empty");
        }
        int data  = firstNode.data;
        StackNode temp = firstNode.pre;
        firstNode.pre.next=null;
        firstNode.pre=null;
        firstNode=temp;
        top--;
        return  data;
    }

    public  void showStack ()
    {
        System.out.println("StackElements: ");
        StackNode temp = firstNode;
        for(int i = top;i>=0;i--)
        {
            System.out.print(temp.data+" ");
            temp=temp.pre;

        }
    }

    public static void main(String[] args) {
        MyStackLink m = new MyStackLink(10);
        m.push(1);
        m.push(2);
        m.push(3);
//        System.out.println(m.pop());
//        System.out.println(m.pop());
//        System.out.println(m.pop());
        //1-2-3
        m.showStack();
    }
}
class StackNode {
    StackNode next ;
    StackNode pre;
    int data ;

    public StackNode(int data) {
        this.data = data;
    }
    public StackNode() {

    }
}
