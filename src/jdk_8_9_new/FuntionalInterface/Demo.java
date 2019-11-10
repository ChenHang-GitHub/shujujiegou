package jdk_8_9_new.FuntionalInterface;
/*
*
* 函数式接口的使用：  可以作为方法的参数或者返回值类型
* */
public class Demo {

    public  static  void show  (MyFuntionalInterface myFuntionalInterface)
    {
        myFuntionalInterface.method();
    }

    public static void main(String[] args) {
        show(new FuntionalInterfaceImpl());  //参数是接口，可以传递接口的实现类
        show(new MyFuntionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        });
        //lambda 表达式的形式  (方法的参数是一个函数式接口的时候)
        show( ()-> System.out.println("lambda") );
    }


}
