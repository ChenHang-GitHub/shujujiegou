package jdk_8_9_new.Java_util_function;

import java.util.function.Predicate;

/**
 * @ClassName: Demo_Predicate
 * @author: csh
 * @date: 2019/10/23  21:20
 * @Description:  java.util.function.Predicate;
 */
public class Demo_Predicate {

    //一个判断条件
    public  static  boolean checkString(String s , Predicate<String> pre)
    {
        return  pre.test(s);
    }
    // && 运算判断

    public  static  boolean checkString2(String s , Predicate<String> pre1,Predicate<String> pre2)
    {
        return  pre1.test(s) && pre2.test(s);
    }

    public  static  boolean checkString3(String s , Predicate<String> pre1,Predicate<String> pre2)
    {
        return  pre1.test(s) || pre2.test(s);
    }

    public static void main(String[] args) {

        String s = "abc";
        boolean b = checkString(s, (str) -> {
            if (s.length() == 3)
                return true;
            return false;
        });



    }
}
