package shujujiegou;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 需要先把中缀表达式转换成后缀表达式
 * 逆波兰后缀表达式 ：简单的计算器实现*/
public class PolandNotation {
    public static void main(String[] args) {
        //中缀表达式：
        String expression = "1+((2+3)*4)-5";
        //将中缀表达式转换成list
        List<String> infixList = getListString(expression);
//        System.out.println(infixList);

        //将转换的list转换成后缀表达式
        List<String> suffixExpression = getsuffixExpressionList(infixList);
//        System.out.println(suffixExpression);

        //调用方法 输出结果
        System.out.println("Count:"+calculate(suffixExpression));

    }

    // 将转换的list转换成后缀表达式  中缀表达式--》后缀表达式 :  [1, +, (, (, 2, +, 3, ), *, 4, ), -, 5] --> ？
    private static List<String> getsuffixExpressionList(List<String> infixList) {
        List<String> li = new ArrayList<>();
        Stack<String> s1 = new Stack<>(); // s1 是一个符号栈

        for (String item : infixList
                ) {
            if (item.matches("\\d+")) {
                //如果是一个数就直接加入li
                li.add(item);
            } else if (item.equals("(")) {
                s1.push(item);

            } else if (item.equals(")")) {
                //如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2，直到遇到左括号为止，此时将这一对括号丢弃
                while (true) {
                    if(s1.peek().equals("("))
                    {

                        break;
                    }
                    li.add(s1.pop());
                }
                s1.pop(); //!!!消除（
            } else {
                // + - * /  的情况：

                //当item的优先级小于等于s1栈顶运算符, 将s1栈顶的运算符弹出并加入到s2中，再次转到(4.1)与s1中新的栈顶运算符相比较
                while (s1.size() != 0 &&  checkPriority(s1.peek()) >= checkPriority(item) ) {
                    li.add(s1.pop());
                }
                s1.push(item);

            }


        }


        while (s1.size() != 0) {
            //将剩余的加入队列
            li.add(s1.pop());
        }
        return li;
    }


    public static int checkPriority(String oper) {
        if (oper.equals("*") || oper.equals("/")) {
            return 1;
        } else if (oper.equals("-") || oper.equals("+")) {
            return 0;
        } else {
            return -1;
        }
    }

    //中缀表达式转换还成对应的list  expression = "1+((2+3)*4)-5";
    private static List<String> getListString(String expression) {
        List<String> ls = new ArrayList<>();
        //遍历expreesion的指针
        int index = 0;
        //多位数
        String joinNum = "";
        char ch = ' ';
        while (index < expression.length()) {
            ch = expression.charAt(index);
            if (ch < 48 || ch > 57) {
                ls.add(ch + "");
                index++;
            } else {
                joinNum = "";

                while (index < expression.length() && (expression.charAt(index) >= 48 && expression.charAt(index) <= 57)) {
                    joinNum += ch;
                    index++;
                }
                ls.add(joinNum);
            }

        }


        return ls;
    }

    public static int calculate(List<String> ls) {
        // 创建给栈, 只需要一个栈即可
        Stack<String> stack = new Stack<String>();
        // 遍历 ls
        for (String item : ls) {
            // 这里使用正则表达式来取出数
            if (item.matches("\\d+")) { // 匹配的是多位数
                // 入栈
                stack.push(item);
            } else {
                // pop出两个数，并运算， 再入栈
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num1 + num2;
                } else if (item.equals("-")) {
                    res = num1 - num2;
                } else if (item.equals("*")) {
                    res = num1 * num2;
                } else if (item.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("运算符有误");
                }
                //把res 入栈
                stack.push("" + res);
            }

        }
        //最后留在stack中的数据是运算结果
        return Integer.parseInt(stack.pop());
    }


//
//    public static List<String> getListString(String suffixExpression) {
//        //将 suffixExpression 分割
//        String[] split = suffixExpression.split(" ");
//        List<String> list = new ArrayList<String>();
//        for(String ele: split) {
//            list.add(ele);
//        }
//        return list;
//
//    }


}

