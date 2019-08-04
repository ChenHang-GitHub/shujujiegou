package shujujiegou;
/**
 * 普通队列
 */

public class MyQueue {
    int  element[];
    public MyQueue()
    {
        element = new int[0];  //
    }
    //进队
    public  void  push(int el)
    {
        int newArr[] = new int[element.length+1];
        for(int i=0;i<element.length;i++)
        {
            newArr[i] = element[i];
        }
        newArr[element.length] = el;
        element = newArr;
    }
    //出队
    public  int  poll()
    {
        if(element.length==0)
        {
            return  -1;
        }
        int index =  element[0];
        int[] newArr = new int[element.length-1];

        for(int i = 0 ;i<element.length-1;i++)
        {
            newArr[i] = element[i+1];
        }
        element = newArr;
        return  index;
    }

    public static void main(String[] args) {
        MyQueue m  = new MyQueue();
        m.push(1);
        m.push(2);
        System.out.println(m.poll());
        System.out.println(m.poll());
    }
}
