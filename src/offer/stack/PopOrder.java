package offer.stack;

import java.util.ArrayList;
import java.util.Stack;

/*
* 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
* 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
* （注意：这两个序列的长度是相等的）
 */
public class PopOrder {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0 || popA.length==0 ||pushA.length!=popA.length)
        {
            return false;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int popAIndex =0;
        int pushAIndex=0;
        while (pushAIndex<=pushA.length-1 && popAIndex<=popA.length-1)
        {
            if(pushA[pushAIndex]!=popA[popAIndex])
            {
                temp.add(pushA[pushAIndex++]);
            }else {
                popAIndex++;
                pushAIndex++;
            }
        }
        if(popAIndex==pushAIndex)
        {
            return true;
        }
        int i =1;
        while (temp.size()>=i)
        {
            System.out.println(temp.get(temp.size()-i));
            if(temp.get(temp.size()-i)!=popA[popAIndex++]){return  false;}
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[]= {4,5,3,2,1};
        boolean b = IsPopOrder(arr1, arr2);
        System.out.println(b);
    }
}
