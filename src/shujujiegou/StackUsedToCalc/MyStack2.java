package shujujiegou.StackUsedToCalc;

/*
* 栈的数组实现 maxsize
* */
public class MyStack2 {
    int  element[];
    int maxsize;
    private int  top = -1;

    public MyStack2(int maxsize)
    {
        this.top=-1;
        this.maxsize=maxsize;
        element = new int[maxsize];
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
        element[top] =data;


    }
    public  int  pop ()
    {
        if(this.isEmpty())
        {
            System.out.println("Empty");
            throw  new RuntimeException("Empty");
        }
       int data = element[top] ;
        top--;
        return data;
    }

    public  void showStack ()
    {
        System.out.println("StackElements: ");
        for(int i = top;i>=0;i--)
        {
            System.out.print(element[i]+" ");
        }
    }

    public  int peek ()
    {
        return  element[top];
    }

    public static void main(String[] args) {
        MyStack2 m = new MyStack2(10);
        m.push(1);
        m.push(2);
        m.push(3);
        //1-2-3
        m.showStack();
    }

    public boolean isOper(char ch) {
        if(ch =='+'|| ch=='-'||ch=='*'||ch=='/')
        {
            return true;
        }else
        {
            return false;
        }

    }

    public int checkPriority(char oper) {
        if(oper == '*' || oper == '/'){
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1; // 假定目前的表达式只有 +, - , * , /
        }
    }

    public int cal(int num1, int num2, int oper) {
        int res = 0; // res 用于存放计算的结果
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;// 注意顺序
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }
}
