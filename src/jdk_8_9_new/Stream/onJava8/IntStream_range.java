package jdk_8_9_new.Stream.onJava8;

import static java.util.stream.IntStream.range;

/**
 * @ClassName: IntStream_range
 * @author: csh
 * @date: 2019/11/2  20:09
 * @Description: IntStream 类提供了 range() 方法用于生成整型序列的流。编写循环时，这个方法会更加便利：
 */
public class IntStream_range {

    public static void main(String[] args) {
        // 传统方法:
        int result = 0;
        for (int i = 10; i < 20; i++)
            result += i;
        System.out.println(result);
        // for-in 循环:
        result = 0;
        for (int i : range(10, 20).toArray())
            result += i;
        System.out.println(result);
        // 使用流:
        System.out.println(range(10, 20).sum());
    }
}
