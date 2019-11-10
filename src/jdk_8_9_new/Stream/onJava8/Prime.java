package jdk_8_9_new.Stream.onJava8;

import java.util.stream.*;

import static java.util.stream.LongStream.iterate;
import static java.util.stream.LongStream.rangeClosed;

/**
 * @ClassName: Prime
 * @author: csh
 * @date: 2019/11/3  17:34
 * @Description: distinct()：在 Randoms.java 类中的 distinct() 可用于消除流中的重复元素。相比创建一个 Set 集合，该方法的工作量要少得多。
 * filter(Predicate)：过滤操作会保留与传递进去的过滤器函数计算结果为 true 元素。
 */
public class Prime {
    public static Boolean isPrime(long n) {
        return rangeClosed(2, (long) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }

    public LongStream numbers() {
        return iterate(2, i -> i + 1)
                .filter(Prime::isPrime);
    }

    public static void main(String[] args) {
        new Prime().numbers()
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));

        System.out.println();

        new Prime().numbers()
                .skip(90)
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
    }

}
