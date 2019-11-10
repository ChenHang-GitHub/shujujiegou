package jdk_8_9_new.Stream.onJava8;

import static java.util.stream.IntStream.range;
import static jdk_8_9_new.Stream.onJava8.Repeat.repeat;

/**
 * @ClassName: Repeat_Demo
 * @author: csh
 * @date: 2019/11/2  20:22
 * @Description:   简化for循环操作
 */

//Runnable  函数式接口
class Repeat {
    public static void repeat(int n, Runnable action) {
        range(0, n).forEach(i -> action.run());
    }
}

public class Repeat_Demo {
    static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {

        repeat(3, () -> System.out.println("Looping"));
        repeat(2, Repeat_Demo :: hi);


    }
}
