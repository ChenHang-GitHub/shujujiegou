package jdk_8_9_new.MethodReference;
import com.sun.deploy.util.StringUtils;

/**
 * @ClassName: Demo
 * @author: csh
 * @date: 2019/10/24  21:58
 * @Description:   方法引用
 * 对象 :: 实例方法名
 * 类 :: 静态方法名
 * 类 :: 实例方法名
 */
public class Demo {
    public static  void printString(Printable printable)
    {

        printable.print("a");
    }
    public static void main(String[] args) {
//        printString(new Printable() {
//            @Override
//            public void print(String s) {
//                System.out.println(s);
//            }
//        });
        printString(s-> System.out.println(s));
        //方法引用   参数可以省略 但一定要方法可以接收的
        printString(System.out::println);

    }
}
