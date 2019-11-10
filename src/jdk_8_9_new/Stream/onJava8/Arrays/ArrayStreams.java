package jdk_8_9_new.Stream.onJava8.Arrays;

import java.util.Arrays;

/**
 * @ClassName: ArrayStreams
 * @author: csh
 * @date: 2019/11/3  17:18
 * @Description: stream() 同样可以产生 IntStream，LongStream 和 DoubleStream。
 */
public class ArrayStreams {

    public static void main(String[] args) {
        Arrays.stream(new double[]{3.14159, 2.718, 1.618})
                .forEach(n -> System.out.format("%f ", n));
        System.out.println();

        Arrays.stream(new int[]{1, 3, 5})
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        Arrays.stream(new long[]{11, 22, 44, 66})
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();


        // 选择一个子域:
        Arrays.stream(new int[] { 1, 3, 5, 7, 15, 28, 37 }, 3, 6)
                .forEach(n -> System.out.format("%d ", n));

    }

}
