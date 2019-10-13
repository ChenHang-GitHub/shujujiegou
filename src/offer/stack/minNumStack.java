package offer.stack;

import java.util.Stack;

/*
* 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
*/
public class minNumStack {

    Stack<Integer> stack1 =  new Stack<>();
    Stack<Integer> temp =  new Stack<>();

    public void push(int node) {
        stack1.push(node);
        if(temp.size()==0||temp.peek()>=node)
        {
            temp.push(node);
        }
    }

    public void pop() {
        if(stack1.size()!=0)
        {
            if(stack1.peek()==temp.peek())
            {
                stack1.pop();
                temp.pop();
            }else {
                stack1.pop();
            }
        }
    }

    public int top() {
        if(stack1.size()!=0)
        {
            return  stack1.peek();
        }
        return -1;
    }

    public int min() {
        if(temp!=null)
        {
            return temp.peek();
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
    }

}
