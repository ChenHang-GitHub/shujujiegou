package jdk_8_9_new.Lambda;


import java.util.Arrays;
import java.util.Comparator;
/*
*
* */
public class Demo {
    public  static  void show  (MyFuntionalInterface myFuntionalInterface)
    {
        myFuntionalInterface.method();
    }

    public  static Comparator<String> comparable(){
        //返回匿名内部类的方式
//         return new Comparator<String>() {
//             @Override
//             public int compare(String o1, String o2) {
//                 return o1.length()-o2.length();
//             }
//         };
        //返回lambda的形式
        return  (o1,o2)->{return o2.length()-o1.length();};
    }

    public static void main(String[] args) {
        //lambda 表达式的形式  (方法的参数是一个函数式接口的时候)
        show(()-> System.out.println("lambda"));
        //当方法的返回值是接口的时候
        String []arr = {"aaa","b","ccccc"};
        Arrays.sort(arr,comparable());
        System.out.println(Arrays.toString(arr));

    }

}
