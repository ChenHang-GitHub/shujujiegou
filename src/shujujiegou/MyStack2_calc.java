package shujujiegou;

/*
 * 中缀表达式实现计算器：
 * 栈的数组实现 maxsize    实现简单的计算器功能 +  - * /  未对（） 等进行处理
 *
 */
public class MyStack2_calc {


    public static void main(String[] args) {
        MyStack2 numStack = new MyStack2(100);
        MyStack2 operStack = new MyStack2(100);
        String expression = "2*3-5/1";
        int index =0; // 扫描expression
        int num1,num2;
        int oper ;
        int res ;
        char ch =  ' ';  //保存扫描到的字符
        String JoinNum ="";
        while (true)
        {
            ch =  expression.substring(index,index+1).charAt(0);
            if(operStack.isOper(ch))
            {
                if(operStack.isEmpty())
                {
                    //operStack为空的话直接入栈
                    operStack.push(ch);

                }else {
                    //处理不为空情况
                    if(operStack.checkPriority(ch)<=operStack.checkPriority((char)operStack.peek()))
                    {
                        num1 =numStack.pop();
                        num2 =numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1,num2,oper);
                        System.out.println("cal:"+res);
                        numStack.push(res);
                        operStack.push(ch);
                    }else
                    {
                        operStack.push(ch);
                    }

                }
            }else {
                //要考虑处理多位数的情况

                JoinNum += ch;
                if(index == expression.length()-1)
                {
                    //expression的最后一位 不用处理直接入栈
                    numStack.push(Integer.parseInt(JoinNum));
                }else {
                    if(operStack.isOper(expression.substring(index+1,index+2).charAt(0)))
                    {
                        numStack.push(Integer.parseInt(JoinNum));
                        JoinNum="";
                    }

                }
            }


            index++;
            if(index>=expression.length())
            {
                break;
            }
        }

        //expression都入完栈后 处理两个栈得出结果
        while (true)
        {

            if(operStack.isEmpty())
            {
                //符号栈为空 说明数栈中只有一个数就是结果
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);
        }
// pop出最后的结果
        System.out.println("Sum = "+numStack.pop());

    }
}