package shujujiegou;

/*
* 栈的数组实现*/
public class MyStack {
    int  element[];
    public  MyStack()
    {
        element = new int[0];
    }

    public  void  push(int el)
    {
        int newArr[] = new int[element.length+1];
        for(int i=0;i<element.length;i++)
        {
            newArr[i] = element[i];
        }
        newArr[element.length] = el;
        element = newArr;
        System.out.println(element.length);
    }
    public  int  pop ()
    {
        int index=-1;
        if(element.length==0)
        {
            return index;
        }
        index = element[element.length-1];
        int arr[] = new int[element.length-1];
        for(int i=0;i<element.length-1;i++)
        {
            arr[i] = element[i];
        }
        element = arr;

        return  index;
    }

    public static void main(String[] args) {
        MyStack m = new MyStack();
        m.push(1);
        m.push(2);
        m.push(3);
        //1-2-3
        System.out.println(m.pop());
        System.out.println(m.pop());
        System.out.println(m.pop());
        //3-2-1


    }
}
