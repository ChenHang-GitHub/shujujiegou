package shujujiegou.HashTable;

/*
* HashTaable     实现Emp的增删改查   （缓存？）
* */
public class HashTabDemo {


    public static void main(String[] args) {
        EmpNode node1 = new EmpNode(1,"a");
        HashTab hashTab = new HashTab(10);
        hashTab.add(node1);
        hashTab.list();




    }
}




//创建HashTab 管理多条链表
class   HashTab {
    private  int size;
    EmpLinkedList[] empLinkedLists ;

    public HashTab(int size) {
        this.size = size;
        empLinkedLists = new EmpLinkedList[size];


        for(int i = 0; i < size; i++) {
            empLinkedLists[i] = new EmpLinkedList();
        }

    }

    public  void  add (EmpNode empNode)
    {
        int No  =   getNo(empNode.id);
        empLinkedLists[No].add(empNode);

    }

    public  void  list()
    {
        for(int i = 0; i < size; i++) {
            empLinkedLists[i].list(i);
        }
    }


    private int getNo(int id) {
        return id % size;
    }


}

//创建EmpLinkedList ,表示每个链表
class  EmpLinkedList {
    EmpNode head;

    public void add(EmpNode empNode) {
        if(head==null)
        {
            head = empNode;
            return;
        }
        EmpNode temp = head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=empNode;
    }


    public  void  list (int no)
    {
        if(head==null)
        {
            System.out.print(no+":Empty");
            return;
        }

        EmpNode temp = head;
        while (temp!=null)
        {
            System.out.print(temp.id+" :" +temp.name);
            temp=temp.next;
        }
        System.out.println();

    }



}


class  EmpNode {
    int id ;
    String name ;
    EmpNode  next ;

    public EmpNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}