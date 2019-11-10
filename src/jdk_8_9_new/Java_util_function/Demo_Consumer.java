package jdk_8_9_new.Java_util_function;

import java.util.function.Consumer;

/**
 * @ClassName: Demo_Consumer
 * @author: csh
 * @date: 2019/10/23  20:44
 * @Description:  java.util.function.Consumer;
 */
public class Demo_Consumer {

    //消费一次
    public  static  void  cost(String  name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    //andThen 方法：
    public  static  void  cost2(String name, Consumer<String> consumer1,Consumer<String> consumer2)
    {
//        consumer1.accept(name);
//        consumer2.accept(name);
        consumer1.andThen(consumer2).accept(name);   //按顺序执行
    }


    public static void main(String[] args) {
        cost("csh", new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });

        String s = "csh";
        //cost
        cost(s,(name)->{
            System.out.println(name);
        });
        //cost2
        cost2(s,(name)->{
            System.out.println(name.toLowerCase());
        },(name)->{
            System.out.println(name.toUpperCase());
        });



    }
}
